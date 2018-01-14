package √¿Õ≈2016;

public class Demo4 {

	public static void print(){
		System.out.println("MTDP");
		}

	public static void main(String[] args) {
		try {
			((Demo4)null).print();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}
	}
}
