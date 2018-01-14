package Å£¿Í;

class Demo1 {
	
	private static String str = "dd";
	public static void main(String[] args) throws InterruptedException {
		synchronized (str) {
			
			str.wait();
		}
	}
}