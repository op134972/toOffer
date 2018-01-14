package Ô¶¾°ÄÜÔ´;

public class Demo2 {

	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
	public boolean checkBST(TreeNode root) {
		if(root == null)
			return true;
		if(root.left!=null&&root.left.val>root.val)
			return false;
		
		if(root.right!=null&&root.right.val<root.val)
			return false;
		
		return checkBST(root.left)&&checkBST(root.right);
	}
}
