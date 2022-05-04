package binaryTree;

import com.sun.corba.se.impl.protocol.giopmsgheaders.ReplyMessage_1_0;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 20:52 2022/5/3
 * @ Description：
 */
public class t9 {

	public boolean isBalanced(TreeNode root) {
		return get(root) != -1;
	}

	public int get(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = get(root.left);
		if (leftHeight == -1) {
			return -1;
		}
		int rightHeight = get(root.right);
		if (rightHeight == -1) {
			return -1;
		}
		if (Math.abs(leftHeight - rightHeight) > 1) {
			return -1;
		}
		return 1;

	}

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
}
