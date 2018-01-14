package 剑指offer;




/*
 * 题目描述
求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class Demo46 {
	
    public static int Sum_Solution(int n){
    	int sum = n;
    	
    	boolean flag = n!=0&&(sum = sum+Sum_Solution(n-1))>0;
    	
    	return sum;
    }


    
    public static void main(String[] args) {
		System.out.println(Sum_Solution(10));
	}
}
