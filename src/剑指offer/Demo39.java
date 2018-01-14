package ½£Ö¸offer;

import java.util.ArrayDeque;
import java.util.Queue;

public class Demo39 {

	public static void main(String[] args) {
		TreeNode node = new TreeNode(2);
		node.left = new TreeNode(1);
		TreeNode root = new TreeNode(3);
		root.left = node;
		
		System.out.println(TreeDepth(root));
	}

	public static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}

	public static int TreeDepth(TreeNode root) {
		if (root == null)
			return 0;

		Queue<TreeNode> queue = new ArrayDeque<>();

		int count = 0;
		int curr = 0;
		int next = 0;
		int deep = 1;

		while (!queue.isEmpty() || root != null) {
			if (root.left != null) {
				queue.offer(root.left);
				next++;
			}
			if (root.right != null) {
				queue.offer(root.right);
				next++;
			}
			if (!queue.isEmpty()) {
				root = queue.poll();
				if (count == curr) {
					deep++;
					count = 0;
					curr = next;
					next = 0;
				}
				count++;
			} else {
				break;
			}
		}

		return deep;

	}
	private boolean flag = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        deep2(root);
        
        return flag;
    }
    private int deep2(TreeNode root){
        
        int ld = deep2(root.left);
        int rd = deep2(root.right);
        if(Math.abs(ld-rd)>1)
            flag = false;
        
        return Math.max(ld,rd)+1;
    }
}
