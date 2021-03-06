package hu.bme.mit.incqueryd.spark.utils

import java.io.ByteArrayInputStream
import java.io.FileWriter
import java.io.ObjectInputStream
import java.util.Date

import scala.concurrent.duration.DurationInt

import org.apache.spark.SparkContext
import org.apache.spark.SparkJobInfo

import com.google.common.net.HostAndPort

import akka.actor.ActorPath
import hu.bme.mit.incqueryd.actorservice.ActorId
import hu.bme.mit.incqueryd.actorservice.AkkaUtils
import hu.bme.mit.incqueryd.actorservice.YarnActorService
import hu.bme.mit.incqueryd.engine.rete.actors.ReteActorKey
import hu.bme.mit.incqueryd.engine.rete.dataunits.Tuple
import hu.bme.mit.incqueryd.idservice.IDService
import hu.bme.mit.incqueryd.yarn.IncQueryDZooKeeper

/**
 * @author pappi
 */
object IQDSparkUtils {

  val DEFAULT_DURATION = 100
  val DEFAULT_TIMEOUT = 300 second
  val DEFAULT_LOAD_TIMEOUT = 900
  val SPARK_HOME = "/usr/local/spark"
  val MAIN_CLASS = "hu.bme.mit.incqueryd.spark.IQDSparkMain"
  val HDFS_JAR_PATH = "hdfs://yarn-rm.docker:9000/jars/hu.bme.mit.incqueryd.actorservice.server-1.0.0-SNAPSHOT.jar"
  val RESULT_BASE_DIR = "hdfs://yarn-rm.docker:9000/"
  val BROKER_URL = "tcp://yarn-rm.docker:9876"
  
  val OPTION_PROCESSING_METHOD = "proc_method"
  val OPTION_DATABASE_BACKEND = "backend"
  val OPTION_DURATION = "duration"
  val OPTION_DATASOURCE_URL = "ds_url"
  val OPTION_NO_DATA_TIMEOUT_MS = "no_data_timeout"
  val OPTION_QUERY_ID = "query_id"
  val OPTION_SINGLE_RUN = "single"
  val OPTION_NUM_EXECUTORS = "num_exectrs"
  val OPTION_SCHEDULER_MODE = "scheduler_mode"
  val OPTION_ZK_PATH = "zk_path"
  
  def getJobInfo(sc : SparkContext, jobId : Int) : SparkJobInfo = {
    sc.statusTracker.getJobInfo(jobId).get
  }
  
  def writeln(obj: AnyRef) {
    val writer = new FileWriter("/tmp/spark_iqd.txt", true)
    writer.write(s"${new Date} | ${obj.toString()}\n")
    writer.close()
  }
  
  def writeException[T]()(fn: => T): T = {
    try {
      fn
    } catch {
      case e: Exception => {
        writeln(s"Exception: $e")
      }
      throw e;
    }
  }
  
  def resolveIDs(tuples : Set[Tuple]) : Set[Tuple] = {
    tuples.map { tuple =>
      val val0 = IDService.resolveID(tuple.get(0).asInstanceOf[Long])
      if(tuple.size() == 1) {
        new Tuple(val0)
      } else {
        val val1 = tuple.get(1)
        if(val1.isInstanceOf[Long]) {
          new Tuple(val0, IDService.resolveID(val1.asInstanceOf[Long]))
        } else {
          new Tuple(val0, val1)
        }
      }
    }
  }
  
  def deserializeProductionMessage[T](msg : Array[Byte]) : T = {
    val b = new ByteArrayInputStream(msg);
    val o = new ObjectInputStream(b);
    o.readObject().asInstanceOf[T]
  }
  
  
  
  def getJars() : Array[String] = {
    Array(HDFS_JAR_PATH)
  }
  
  def getInputActorPathByZnodePath(znodeId: String): ActorPath = {
    val address = HostAndPort.fromString(IncQueryDZooKeeper.getStringData(s"${IncQueryDZooKeeper.inputNodesPath}/$znodeId${IncQueryDZooKeeper.addressPath}"))
    val actorName = IncQueryDZooKeeper.getStringData(s"${IncQueryDZooKeeper.inputNodesPath}/$znodeId${IncQueryDZooKeeper.actorNamePath}")
    val actorId = new ActorId(YarnActorService.actorSystemName, address.getHostText, address.getPort, actorName)
    ActorPath.fromString(AkkaUtils.toActorPath(actorId))
  }
  
}
