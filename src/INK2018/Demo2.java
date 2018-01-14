package INK2018;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo2 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String str1 = sc.next();
			String str2 = sc.next();
			
			
			System.out.println(fun(str1,str2));
			
		}

		private static int fun(String str1, String str2) {
			String[] arr1 = str1.trim().split("£¬");
			String[] arr2 = str2.trim().split("£¬");
			
			int n = 0;
			for (int i = 0; i < arr1.length; i++) {
				n^=Integer.valueOf(arr1[i]);
			}
			for (int i = 0; i < arr2.length; i++) {
				n^=Integer.valueOf(arr2[i]);
			}
		
			return n;
		}
}
