package 剑指offer;



/**
 * 不适用额外变量交换两个数的值
 * @author lenovo
 *
 */
public class Demo47_2 {

	
	public static void main(String[] args) {
		int a =10;
		int b = 15;
		
		//方法1：基于加减
		a = a+b;
		b = a-b;
		a = a-b;
		
		
		//方法2：基于乘除
		a = a*b;
		b = a/b;
		a = a/b;
		
		//方法3：基于位运算    001  101
		/*
		 * 001 101   
		 * 1、
		 */
		a = a^b;
		b = a^b;   //a^b^b=a   一个数与自身取异得0，且满足交换律。 
		a = a^b;
		
		
		
		
		System.out.println(a+":::"+b);
	}
}
