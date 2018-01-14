package Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 2°¢await(),signal()
 */
public class ProAndCus2 {
	private static int size = 10;
	private static int count = 0;
	private static Lock lock = new ReentrantLock();
	private static Condition condition = lock.newCondition();

	class Pro implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {
					lock.lock();
					while (count == size) {
						System.out.println("¬˙¡À");
						try {
							condition.await();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					count++;
					condition.signalAll();
					System.out.println("pro say current:" + count);
				} finally {
					lock.unlock();
				}
			}
		}
	}

	class Cus implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {
					lock.lock();
					while (count == 0) {
						System.out.println("ø’¡À");
						try {
							condition.await();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					count--;
					condition.signalAll();
					System.out.println("cus say current:" + count);
				} finally {
					lock.unlock();
				}
			}
		}
	}

	public static void main(String[] args) {
		ProAndCus2 pac = new ProAndCus2();
		Thread pro = new Thread(pac.new Pro());
		Thread cus = new Thread(pac.new Cus());
		pro.start();
		cus.start();
	}

}
