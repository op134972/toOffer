package SOF;

import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		int i = 0;
		while(true){
			list.add("hello"+i++);
		}
	}
	class Father{
		public void fun1(){};
	}
	
	class Son extends Father{
		@Override
		private void fun1() {
			// TODO Auto-generated method stub
			super.fun1();
		}
	}
}
