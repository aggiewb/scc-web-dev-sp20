
public class IntTree {
	private IntTreeNode overallRoot;
	
	public IntTree() {
		overallRoot = null;
	}
	
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
	
	public int countEmpty(){
	    return countEmpty(overallRoot);
	}

	private int countEmpty(IntTreeNode root){
	    if(root == null){
	        return 1;
	    } else {
	        return countEmpty(root.left) + countEmpty(root.right);
	    }
	}
}
