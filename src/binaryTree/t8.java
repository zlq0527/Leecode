package binaryTree;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 20:36 2022/5/3
 * @ Description：完全二叉树的节点个数
 */
public class t8 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public int countNodes(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 	countNodes(root.left) + 1+countNodes(root.right);
	}
}
