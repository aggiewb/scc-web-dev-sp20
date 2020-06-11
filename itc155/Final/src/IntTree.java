
public class IntTree {
	private IntTreeNode overallRoot;
	
	public void add(int value) {
		overallRoot = add(overallRoot, value);
	}
	
	private IntTreeNode add(IntTreeNode root, int value) {
		if(root == null) {
			root = new IntTreeNode(value);
		} else if(value <= root.data) {
			root.left = add(root.left, value);
		} else {
			root.right = add(root.right, value);
		}
		return root;
	}
	
	public boolean isFull(){
	    return isFull(overallRoot);
	}

	private boolean isFull(IntTreeNode root){
	    if(root == null){
	        return true;
	    } else if (root.left != null && root.right == null){
	        return false;
	    } else if(root.left == null && root.right != null){
	        return false;
	    } else {
	        return isFull(root.left) && isFull(root.right);
	    }
	}
}
