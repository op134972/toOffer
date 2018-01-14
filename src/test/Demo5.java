package test;

public class Demo5 {
	static class DD{
		public static final int aa = 11;
		static{
			System.out.println("DD loaded");
		}
	}
	
	public static void main(String[] args) {
		DD[] a = new DD[10];
		System.out.println(DD.aa);
	}
}
