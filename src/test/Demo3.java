package test;

import java.util.Scanner;

public class Demo3 {
	    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
	       while(true){
	        
	        int n = sc.nextInt();
	        
	        System.out.print(fun1(n));
	        System.out.println();
	       }
	        
	    }
	    
	    private static long fun1(int n){
	        int [] arr = {1,1,1,1,1,2};
	        if(n<0)
	        	return 0;
	        if(n<=5)
	        	return arr[n];
	        
	        return fun1(n-1)+fun1(n-5)+fun1(n-10)+fun1(n-20)+fun1(n-50)+fun1(n-100);
	        
	    }
	    
}
