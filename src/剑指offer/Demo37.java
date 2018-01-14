package 剑指offer;

public class Demo37 {
 	
 	
	public static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	
	 public static  ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
	        int len1 = 0;
	        int len2 = 0;
	        ListNode p1 = pHead1;
	        ListNode p2 = pHead2;
	        while(pHead1!=null){
	            len1++;
	            pHead1 = pHead1.next;
	        }
	         while(pHead2!=null){
	            len2++;
	            pHead2 = pHead2.next;
	        }
	        if(len1==0||len2==0)
	            return null;
	        
	        //保证长度相同
	        if(len1>len2){
	            for(int i = 0;i<len1-len2;i++){
	            	p1 = p1.next;
	            }
	        }else{
	            for(int i = 0;i<len2-len1;i++){
	            	p2 = p2.next;
	            }
	        }
	        
	        while(p1!=p2){
	        	p1 = p1.next;
	        	p2 = p2.next;
	        }
	        
	        return p2;
	    }
	 
	 public static void main(String[] args) {
		ListNode a1 = new ListNode(4);
		ListNode a2 = new ListNode(2);
		ListNode p3 = new ListNode(3);
		ListNode b1 = new ListNode(6);
		ListNode b2 = new ListNode(7);
		
		a2.next = p3;
		b2.next = p3;
		a1.next = a2;
		b1.next = b2;
		
		ListNode findFirstCommonNode = FindFirstCommonNode(a1, b1);
		
		System.out.println(findFirstCommonNode == null);
		
		while(findFirstCommonNode!=null){
			System.out.println(findFirstCommonNode.val);
			findFirstCommonNode = findFirstCommonNode.next;
		}
		
	}
}
