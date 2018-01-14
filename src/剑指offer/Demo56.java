package 剑指offer;

public class Demo56 {

	
	static class Node{
		int val;
		Node next;
		public Node(int val) {
			this.val = val;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		n1.next =n2;
		n2.next = n1;
		
		System.out.println(getFir(n1));
		
	}
	
	
	
	/**
	 * 保证带环
	 */
	public static int getFir(Node node){
		return 0;
	}
}
