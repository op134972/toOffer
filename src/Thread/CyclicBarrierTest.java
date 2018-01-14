package Thread;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierTest implements Runnable {

	private static CyclicBarrier cb;
	public CyclicBarrierTest(CyclicBarrier cb) {
		this.cb = cb;
	}

	@Override
	public void run() {
		System.out.println("ready?");
		try {
			System.out.println("current waiting is"
					+ (cb.getNumberWaiting() + 1));
			cb.await();
			System.out.println("go!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newCachedThreadPool();
		CyclicBarrier cb = new CyclicBarrier(5, new Runnable() {
			public void run() {
				System.out.println("gogogo");
			};
		});
		for (int i = 0; i < 20; i++) {
			service.execute(new CyclicBarrierTest(cb));
			Thread.sleep(100);
		}

	}

}
