package test;

public class Demo12_classLoader {
	
	
	static class MyClassLoader extends ClassLoader{
		@Override
		public Class<?> loadClass(String name) throws ClassNotFoundException {
			return super.loadClass(name);
		}
	}
	public static void main(String[] args) throws ClassNotFoundException {
		MyClassLoader mc = new MyClassLoader();
		mc.loadClass("test.Demo11");
	}
	
	static class TestClass{
		static{
			System.out.println("Test Class Init");
		}
	}
}
