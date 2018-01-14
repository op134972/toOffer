package Thread;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import Thread.ProAndCus4.Cus;
import Thread.ProAndCus4.Pro;


/*
 * 5¡¢Pipe
 */
public class ProAndCus5 {
	private static PipedInputStream in = new PipedInputStream();
	private static PipedOutputStream out = new PipedOutputStream();
	
	private static int num = 0;
	static{
		try {
			out.connect(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	class Pro implements Runnable{
		@Override
		public void run() {
			while(true){
				try {
					Thread.sleep(100);
					out.write(("cake"+(num++)).getBytes());
					out.flush();
					System.out.println("pro cake:"+num);
				} catch (IOException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	class Cus implements Runnable{
		byte[] buffer = new byte[1024];
		@Override
		public void run() {
			while(true){
				 try {
					 Thread.sleep(1000);
					in.read(buffer);
					System.out.println("cus "+new String(buffer));
				} catch (IOException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		ProAndCus5 p4 = new ProAndCus5();
		Thread pro = new Thread(p4.new Pro());
		Thread cus = new Thread(p4.new Cus());

		pro.start();
		cus.start();
	}
}
