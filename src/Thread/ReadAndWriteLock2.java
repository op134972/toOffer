package Thread;

import java.util.concurrent.Semaphore;



/*
 * 2���ź���ʵ��
 */
public class ReadAndWriteLock2 {
	
	private static StringBuffer paper = new StringBuffer();
	private static Semaphore writeMutex = new Semaphore(1);//��ʾͬʱֻ��һ����д
	private static Semaphore readMutex = new Semaphore(2);//ͬʱ������2���ܶ�
	
	public void write(String str) throws InterruptedException{
		writeMutex.acquire();//���ܻ�����
		
		System.out.println("Thread "+Thread.currentThread().getId()+"writting..."+str);
		paper.append(str);
		Thread.sleep(100);
		
		writeMutex.release();//�ͷ�����
	}
	
	public void read() throws InterruptedException{
		readMutex.acquire();
		
		System.out.println("Thread "+Thread.currentThread().getId()+"readed..."+paper.toString());
		Thread.sleep(100);
		
		readMutex.release();
	}
	
	public static void main(String[] args) {
		final ReadAndWriteLock2 rw = new ReadAndWriteLock2();
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
