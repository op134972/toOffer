package 剑指offer;

/**
 * 删除链表中的重复节点
 */
public class Demo57 {

	 public static class ListNode {
		    int val;
		    ListNode next = null;

		    ListNode(int val) {
		        this.val = val;
		    }
		}
	public static ListNode deleteDuplication(ListNode pHead)
    {
	
        if(pHead == null)
            return null;
        ListNode head = pHead;
        
        ListNode pre = null;
        ListNode next;
        while(pHead!=null&&pHead.next!=null){
        	if(pHead.val!=pHead.next.val){
        		pre = pHead;
        		pHead = pHead.next;
        		continue;
        	}
        	//此时当前节点pHead与下一节点重复
        	next = pHead.next;
        	while(next!=null&&pHead.val==next.val){
        		next = next.next;
        	}
        	pHead = next;
        	if(pre!=null){
        		pre.next = next;
        	}else{
        		head = pHead;//3、解决头结点就开始重复的问题
        	}
        }
        return head;
    }
	
	public static void main(String[] args) {
		ListNode n2 = new ListNode(9);
		ListNode n3 = new ListNode(8);
		ListNode n4 = new ListNode(8);
		ListNode n5 = new ListNode(7);
		ListNode n6 = new ListNode(6);
		ListNode n7 = new ListNode(6);
		n6.next = n7;
		n5.next = n6;
		n4.next = n5;
		n3.next = n4;
		n2.next = n3;
		//1、测试：普通情况
		ListNode node = deleteDuplication(n2);
		
		//2、测试：一个节点
		ListNode n8 = new ListNode(10);
		//ListNode node = deleteDuplication(n8);
		
		
		//3、测试两个重复节点
		ListNode n9 = new ListNode(10);
		ListNode n10 = new ListNode(10);
		n9.next = n10;
		//ListNode node = deleteDuplication(n9);
		
		
		while(node!=null){
			System.out.println(node.val);
			node = node.next;
		}
		
		
		
	}
}
