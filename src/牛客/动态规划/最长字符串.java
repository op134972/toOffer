package ţ��.��̬�滮;

import java.util.Scanner;

public class ��ַ��� {

	
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        String str1 = sc.nextLine();
	        String str2 = sc.nextLine();
	        
	        System.out.println(fun1(str1,str2));
	    }
	    
	    private static int fun1(String str1,String str2){
	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();
	        
	        int length = 0;
	        //��̬�滮������֮ǰ�Ĳ�������  arrs[i][j]��ʾstr1 i֮ǰ���Ӵ���str2 j֮ǰ���Ӵ�����󳤶ȡ�
	        /*
	         * 1�������ǰλ���ַ���Ӧ��ȣ���ֵΪ1�����Ҽ���i-1��j-1λ�õ�ֵ��i-1\j-1����0��
	         */
	        int[][] arrs = new int[arr1.length][arr2.length];
	        
	        for(int i = 0;i<arr1.length;i++){
	            for(int j = 0;j<arr2.length;j++){
	                if(arr1[i] == arr2[j]){
	                    arrs[i][j] = 1;
	                    if(i!=0&&j!=0){
	                        arrs[i][j] += arrs[i-1][j-1];
	                    }
	                }
	                
	                length = Math.max(length,arrs[i][j]);
	            }
	        }
	        return length;
	    }
}
