package ��ָoffer;

import java.util.Stack;



/*
 * �ж������Ƿ���ջ��pop
 */
public class Demo22 {

	
	public boolean IsPopOrder(int [] pushA,int [] popA) {
		if(pushA.length!=popA.length)
			return false;
		int len = pushA.length;
		int i = 0;
		int j = 0;
		Stack<Integer> stack = new Stack<>();
		for (; i < len; i++) {
			stack.push(pushA[i]);
			while(stack.peek() == popA[j]){
				stack.pop();
				j++;
			}
		}
		
		return stack.empty();
	}
}
