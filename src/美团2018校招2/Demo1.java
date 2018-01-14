package √¿Õ≈2018–£’–2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[]arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
	
		}
		
		System.out.println(fun(arr));
	}

	private static int fun(long[] arr) {
		if(arr.length == 0||arr.length ==0){
			return 0;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(j!=i){
					BigDecimal n = new BigDecimal(arr[i]+""+arr[j]);
					BigDecimal b = new BigDecimal("7");
					BigDecimal[] divide = n.divideAndRemainder(b);
					if(divide[1].toString().equals("0")){
						count++;
					}
				}
			}
		}
		return count;
	}
	
}
