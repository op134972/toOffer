package Thread;

import java.util.concurrent.Semaphore;

import Thread.ProAndCus.Cus;
import Thread.ProAndCus.Pro;


/*
 * 1¡¢Semaphore
 */
public class ProAndCus3 {

	private static Semaphore notFull = new Semaphore(10);
	private static Semaphore notEmpty = new Semaphore(0);
	
	private static Semaphore mutex = new Semaphore(1);
	
	class Pro implements Runnable{
		@Override
		public void run() {

			while(true){
				try {
					notFull.acquire();
					mutex.acquire();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				finally{
					notEmpty.release();
					System.out.println("pro say curr:"+notEmpty.availablePermits());
					mutex.release();
				}
			}
		}
	}
	class Cus implements Runnable{
		@Override
		public void run() {
			while(true){
				try {
					notEmpty.acquire();
					mutex.acquire();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally{
					notFull.release();
					System.out.println("cus say curr:"+notFull.availablePermits());
					mutex.release();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ProAndCus3 pac = new ProAndCus3();
		Thread pro = new Thread(pac.new Pro());
		Thread cus = new Thread(pac.new Cus());
		pro.start();
		cus.start();
	}	
}
