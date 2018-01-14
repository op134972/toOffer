package test;

import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		String base = "hello";
		ArrayList<String> list = new ArrayList<>();
		while(true){
			list.add(base.intern());
			base = base+base;
		}
	}
}
