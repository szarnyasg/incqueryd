/**
 */
package infrastructure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see infrastructure.InfrastructureFactory
 * @model kind="package"
 * @generated
 */
public interface InfrastructurePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "infrastructure";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://incquery.net/d/infrastructure";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "inf";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  InfrastructurePackage eINSTANCE = infrastructure.impl.InfrastructurePackageImpl.init();

  /**
   * The meta object id for the '{@link infrastructure.ElementWithTraceInfo <em>Element With Trace Info</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see infrastructure.ElementWithTraceInfo
   * @see infrastructure.impl.InfrastructurePackageImpl#getElementWithTraceInfo()
   * @generated
   */
  int ELEMENT_WITH_TRACE_INFO = 2;

  /**
   * The feature id for the '<em><b>Trace Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_WITH_TRACE_INFO__TRACE_INFO = 0;

  /**
   * The number of structural features of the '<em>Element With Trace Info</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_WITH_TRACE_INFO_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Element With Trace Info</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_WITH_TRACE_INFO_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link infrastructure.impl.ClusterImpl <em>Cluster</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see infrastructure.impl.ClusterImpl
   * @see infrastructure.impl.InfrastructurePackageImpl#getCluster()
   * @generated
   */
  int CLUSTER = 0;

  /**
   * The feature id for the '<em><b>Trace Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLUSTER__TRACE_INFO = ELEMENT_WITH_TRACE_INFO__TRACE_INFO;

  /**
   * The feature id for the '<em><b>Rete Machines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLUSTER__RETE_MACHINES = ELEMENT_WITH_TRACE_INFO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cache Machines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLUSTER__CACHE_MACHINES = ELEMENT_WITH_TRACE_INFO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cluster</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLUSTER_FEATURE_COUNT = ELEMENT_WITH_TRACE_INFO_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Cluster</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLUSTER_OPERATION_COUNT = ELEMENT_WITH_TRACE_INFO_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link infrastructure.impl.MachineImpl <em>Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see infrastructure.impl.MachineImpl
   * @see infrastructure.impl.InfrastructurePackageImpl#getMachine()
   * @generated
   */
  int MACHINE = 1;

  /**
   * The feature id for the '<em><b>Trace Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE__TRACE_INFO = ELEMENT_WITH_TRACE_INFO__TRACE_INFO;

  /**
   * The feature id for the '<em><b>Ip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE__IP = ELEMENT_WITH_TRACE_INFO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_FEATURE_COUNT = ELEMENT_WITH_TRACE_INFO_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_OPERATION_COUNT = ELEMENT_WITH_TRACE_INFO_OPERATION_COUNT + 0;


  /**
   * Returns the meta object for class '{@link infrastructure.Cluster <em>Cluster</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cluster</em>'.
   * @see infrastructure.Cluster
   * @generated
   */
  EClass getCluster();

  /**
   * Returns the meta object for the containment reference list '{@link infrastructure.Cluster#getReteMachines <em>Rete Machines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rete Machines</em>'.
   * @see infrastructure.Cluster#getReteMachines()
   * @see #getCluster()
   * @generated
   */
  EReference getCluster_ReteMachines();

  /**
   * Returns the meta object for the containment reference list '{@link infrastructure.Cluster#getCacheMachines <em>Cache Machines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cache Machines</em>'.
   * @see infrastructure.Cluster#getCacheMachines()
   * @see #getCluster()
   * @generated
   */
  EReference getCluster_CacheMachines();

  /**
   * Returns the meta object for class '{@link infrastructure.Machine <em>Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Machine</em>'.
   * @see infrastructure.Machine
   * @generated
   */
  EClass getMachine();

  /**
   * Returns the meta object for the attribute '{@link infrastructure.Machine#getIp <em>Ip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ip</em>'.
   * @see infrastructure.Machine#getIp()
   * @see #getMachine()
   * @generated
   */
  EAttribute getMachine_Ip();

  /**
   * Returns the meta object for class '{@link infrastructure.ElementWithTraceInfo <em>Element With Trace Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element With Trace Info</em>'.
   * @see infrastructure.ElementWithTraceInfo
   * @generated
   */
  EClass getElementWithTraceInfo();

  /**
   * Returns the meta object for the attribute '{@link infrastructure.ElementWithTraceInfo#getTraceInfo <em>Trace Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Trace Info</em>'.
   * @see infrastructure.ElementWithTraceInfo#getTraceInfo()
   * @see #getElementWithTraceInfo()
   * @generated
   */
  EAttribute getElementWithTraceInfo_TraceInfo();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  InfrastructureFactory getInfrastructureFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link infrastructure.impl.ClusterImpl <em>Cluster</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see infrastructure.impl.ClusterImpl
     * @see infrastructure.impl.InfrastructurePackageImpl#getCluster()
     * @generated
     */
    EClass CLUSTER = eINSTANCE.getCluster();

    /**
     * The meta object literal for the '<em><b>Rete Machines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLUSTER__RETE_MACHINES = eINSTANCE.getCluster_ReteMachines();

    /**
     * The meta object literal for the '<em><b>Cache Machines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLUSTER__CACHE_MACHINES = eINSTANCE.getCluster_CacheMachines();

    /**
     * The meta object literal for the '{@link infrastructure.impl.MachineImpl <em>Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see infrastructure.impl.MachineImpl
     * @see infrastructure.impl.InfrastructurePackageImpl#getMachine()
     * @generated
     */
    EClass MACHINE = eINSTANCE.getMachine();

    /**
     * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MACHINE__IP = eINSTANCE.getMachine_Ip();

    /**
     * The meta object literal for the '{@link infrastructure.ElementWithTraceInfo <em>Element With Trace Info</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see infrastructure.ElementWithTraceInfo
     * @see infrastructure.impl.InfrastructurePackageImpl#getElementWithTraceInfo()
     * @generated
     */
    EClass ELEMENT_WITH_TRACE_INFO = eINSTANCE.getElementWithTraceInfo();

    /**
     * The meta object literal for the '<em><b>Trace Info</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_WITH_TRACE_INFO__TRACE_INFO = eINSTANCE.getElementWithTraceInfo_TraceInfo();

  }

} //InfrastructurePackage
