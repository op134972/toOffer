package ţ��;

public class Demo_2862517 {

	/*
	 * �������һ��������System. out .println( (b+c).intern()== MESSAGE );
	 * �����true�� intern() �������ȼ�� String �� ( ����˵��ջ�ڴ� ) ���Ƿ����
	 * ��ͬ���ַ�������������оͷ��ء����� intern()���صľ���MESSAGEָ���"taobao"��
	 * �ٰѱ���b��c�Ķ����һ��
	 */
	
	private static String MESSAGE = "xixi";
	public static void main(String[] args) {
		//1���������Ż�
		String a = "xi";
		String b = "xi";
		String c = "xi"+"xi";
		System.out.println((a+b)==MESSAGE);//true�Զ��Ż�
		System.out.println(c == MESSAGE);//false
		
		
		//2��intern���鳣�������Ƿ��У��оͷ���ջ�е����á�
		System.out.println((a+b).intern() == MESSAGE);//true
		
		
		//3���Ѷ���.intern()--->������ݶ��ڴ��ж����ֵ��ȥ����String��
		//���Ƿ�����ͬ���ַ���������оͽ�����ָ�����string���еı�����
	}
}
