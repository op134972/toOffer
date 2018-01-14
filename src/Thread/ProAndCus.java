package Thread;

/*
 * 1、wait\notify实现
 */
public class ProAndCus {
	private static int size = 10;
	private static int count = 0;
	private static Object mutex = new Object();

	class Pro implements Runnable {
		@Override
		public void run() {
			while (true) {
				synchronized (mutex) {
					while (count == size) {
						System.out.println("满了");
						try {
							mutex.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					count++;
					mutex.notifyAll();
					System.out.println("pro say current:" + count);
				}
			}
		}
	}

	class Cus implements Runnable {
		@Override
		public void run() {
			while (true) {
				synchronized (mutex) {
					while (count == 0) {
						System.out.println("空了");
						try {
							mutex.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					count--;
					mutex.notifyAll();
					System.out.println("cus say current:" + count);
				}
			}
		}
	}

	public static void main(String[] args) {
		ProAndCus pac = new ProAndCus();
		Thread pro = new Thread(pac.new Pro());
		Thread cus = new Thread(pac.new Cus());
		pro.start();
		cus.start();
	}
}
