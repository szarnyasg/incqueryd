package hu.bme.mit.incqueryd.databases;
//package distributed.rete.database;
//
//public class AsyncBulkInsertListener implements Runnable {
//
//	protected long n = 0;
//
//	public boolean isFinished() {
//		return n == 0;
//	}
//
//	public void insert() {
//		synchronized (this) {
//			n++;
//		}
////		System.err.println("insert: " + n);
//	}
//
//	public void run() {
//		synchronized (this) {
//			n--;
////			System.err.println("done: " + n);
//			if (n == 0) {
////				System.err.println("notifying");
//				this.notify();
//			}
//		}
//	}
//
// }
