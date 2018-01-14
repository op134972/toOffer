package Thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;


/*
 * 1¡¢¶ÁÐ´ËøÊµÏÖ
 */
public class ReadAndWriteLock {
	private static ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

	private static StringBuffer paper = new StringBuffer();

	public void write(String str) throws InterruptedException {
		try {
			rwl.writeLock().lock();// Ð´Ëø£¬³â¶Á³âÐ´

			System.out.println("writing..."+Thread.currentThread().getId());
			paper.append(str);
			Thread.sleep(1000);
		} finally {
			rwl.writeLock().unlock();
		}
	}

	public void read() throws InterruptedException {
		rwl.readLock().lock();// ³âÐ´²»³â¶Á

		Thread.sleep(10);
		System.out.println(Thread.currentThread() + " readed..."
				+ paper.toString());

		rwl.readLock().unlock();
	}

	public static void main(String[] args) {
		final ReadAndWriteLock rw = new ReadAndWriteLock();
		for (int i = 0; i < 5; i++) {
			new Thread() {
				public void run() {
					int num = 0;
					try {
						while (true) {
							rw.write(num++ + "");
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				};
			}.start();
		}

		for (int i = 0; i < 5; i++) {
			new Thread() {
				public void run() {
					while (true) {
						try {
							rw.read();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				};
			}.start();
		}
	}
}
