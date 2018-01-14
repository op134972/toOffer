package 网易编程题01;

import java.util.Scanner;


/*
 * 小易为了向他的父母表现他已经长大独立了,他决定搬出去自己居住一段时间。
 * 一个人生活增加了许多花费: 小易每天必须吃一个水果并且需要每天支付x元
 * 的房屋租金。当前小易手中已经有f个水果和d元钱,小易也能去商店购买一些
 * 水果,商店每个水果售卖p元。小易为了表现他独立生活的能力,希望能独立生
 * 活的时间越长越好,小易希望你来帮他计算一下他最多能独立生活多少天。 
输入描述:
输入包括一行,四个整数x, f, d, p(1 ≤ x,f,d,p ≤ 2 * 10^9),以空格分割
 */
public class Demo5_独立的小易 {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		int x = sc.nextInt();
		int f = sc.nextInt();
		int d = sc.nextInt();
		int p = sc.nextInt();
		System.out.println(fun(x, f, d, p));
	}
	
	//2 17 20 1
	/**
	 * 简单的抽象
	 * @param x 每天房租
	 * @param f 起始苹果数
	 * @param d 总钱数
	 * @param p 苹果单价
	 * @return
	 */
	private static int fun(int x,int f, int d, int p){
		if(f == 0){
			return d/(p+x);
		}
		else{
			return Math.min((d-x*f)/(p+x)+f, d/x);
		}
	}
}
