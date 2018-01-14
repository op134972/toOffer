package 剑指offer;

/*判断一棵树是不是镜像对称的
 */
public class Demo59 {

	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	public boolean isSymmetrical(TreeNode pRoot) {
		if(pRoot == null){
			return true;
		}
		
		return fun1(pRoot.left,pRoot.right);
	}
	
	private static boolean fun1(TreeNode l,TreeNode r){
		if(l==null&&r==null)
			return true;
		if((l==null&&r!=null))
			return false;
		if(l!=null&&r==null){
			return false;
		}
		
		if(l.val!=r.val)
			return false;
		return fun1(l.left,r.right)&&fun1(l.right,r.left);
	}
}
