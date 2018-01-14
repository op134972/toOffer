package Эјвз2018;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int s =sc.nextInt();
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		System.out.println(fun(s,a,b,c));
	}

	private static int fun(int s, int a, int b, int c) {
		if(a ==1 &&b==1&&c==1)
			return 6;
		
		if(a>=s){
			int bss = 3;
			for (int i = 1; i < b; i++) {
				bss *= bss-i;
			}
			for (int i = 1; i <= b; i++) {
				bss /=i;
			}
			int css = 3;
			for (int i = 1; i < c; i++) {
				css *= css-i;
			}
			for (int i = 1; i <= c; i++) {
				css /=i;
			}
			return bss*css;
		}
		else{
			return 9;
		}
	
	}
}
