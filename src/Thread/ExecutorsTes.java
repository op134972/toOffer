package Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorsTes {
	private static final int NTHREADS = 100;
	//private static Executor exec = Executors.newFixedThreadPool(NTHREADS);
	private static Executor exec = Executors.newCachedThreadPool();
	private static volatile int i = 0;
	
	public static void main(String[] args) {
		while(true){
			Runnable task = new Runnable() {
				
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getId()+"::::");
					System.out.println(i++);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			exec.execute(task);
		}
	}
}
