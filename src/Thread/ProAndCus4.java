package Thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/*
 * 4、阻塞队列
 */
public class ProAndCus4 {

	private static BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);//超过限制阻塞，别的进程进入
	private static int num = 0;

	class Pro implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(10);
					queue.put("cake" + (++num));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("put:cake" + num);
			}

		}
	}

	class Cus implements Runnable {
		@Override
		public void run() {

			while (true) {
				if (!queue.isEmpty()) {
					String cake;
					try {
						Thread.sleep(100);
						cake = queue.take();
						System.out.println("take:" + cake);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		ProAndCus4 p4 = new ProAndCus4();
		Thread pro = new Thread(p4.new Pro());
		Thread cus = new Thread(p4.new Cus());

		pro.start();
		cus.start();
	}
}
