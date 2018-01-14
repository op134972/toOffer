package test;

import java.util.HashMap;

public class ThreadLocalTets {
	private static ThreadLocal<HashMap<String,String>> sessionHolder = new ThreadLocal<>();
	
	
	public HashMap<String,String> get(){
		HashMap<String,String> map = sessionHolder.get();
		if(map!=null){
			
		}
	}
	
}
