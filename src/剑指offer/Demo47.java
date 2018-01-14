package 剑指offer;

/*
 * 不用加减乘除做加法
 */
public class Demo47 {
	public static int Add(int num1, int num2) {

		int dif = num1^num2;
		int and = num1&num2;
		and = and<<1;
		
		return and(and,dif);
		
	}

	private static int and(int and, int dif) {
		if((and&dif)==0)
			return and^dif;
		else{
			return Add(and,dif);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Add(1111,52562));
	}
}
