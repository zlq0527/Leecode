package binaryTree;

import java.util.*;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 17:37 2022/5/1
 * @ Description：二叉树的层序遍历
 */
public class t1 {

	LinkedList<List<Integer>> list2 = new LinkedList<>();
	public List<List<Integer>> levelOrder(TreeNode root) {
		traveltrace(root);
		return list2;
	}

	public void traveltrace(TreeNode node) {
		int a=0;
		if (node == null) {
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(node);
		while (!queue.isEmpty()) {
			List<Integer> list = new ArrayList<>();
			int len = queue.size();
			while (len > 0) {
				TreeNode temp = queue.poll();
				list.add(temp.val);
				if (temp.left != null) {
					queue.offer(temp.left);
				}
				if (temp.right != null) {
					queue.offer(temp.right);
				}
				len--;
			}
			list2.addFirst(list);
		}
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

