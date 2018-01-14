package ½£Ö¸offer;

import java.util.ArrayDeque;
import java.util.Queue;

public class Demo23 {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int val) {
			this.val = val;
		}
	}
	
	
	
	public static void breathPrint(TreeNode node){
		if(node == null)
			return ;
		
		Queue<TreeNode> queue = new ArrayDeque<>();
		while(!queue.isEmpty()||node!=null){
			System.out.println(node.val);
			if(node.left!=null){
				queue.offer(node.left);
			}
			if(node.right != null){
				queue.offer(node.right);
			}
			
			node = queue.poll();
		}
	}
}
