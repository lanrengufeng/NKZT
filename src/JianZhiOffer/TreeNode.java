package JianZhiOffer;

public class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		
		change(root.right);
		System.out.println(root.val);
		System.out.println(root.left.val);
		System.out.println(root.right.val);
	}

	private static void change(TreeNode root) {
		// TODO Auto-generated method stub
		root = new TreeNode(3);
	}
	
}
