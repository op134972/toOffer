package JVM;

public class Demo {

	public static void main(String[] args) {
		/*
		 * 1.7���Ժ�
		 * 1��new �ڳ����غͶ��ж����������ص��Ƕ��е����õ�ַ
		 * 2��
		 */
		String str = new String("test");
		String intern = str.intern();
		System.out.println(str == intern);
		
		
		String str2 = "1";
		String str3 = "1";
		System.out.println(str2 == str3);
		
	}

}
