package ţ��;

public class LazySingleton {

	private static LazySingleton instance = null;
	private static String lock = "lock";

	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			synchronized (lock) {
				if (instance == null) {//�����п�
					instance = new LazySingleton();
					return instance;
				}
				return instance;
			}
		}
		return instance;
	}
}
