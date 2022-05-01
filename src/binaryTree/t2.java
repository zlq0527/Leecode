package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 18:17 2022/5/1
 * @ Description：
 */
public class t2 {

	LinkedList<List<Integer>> list2 = new LinkedList<>();
	List<Integer> list = new ArrayList<>();

	public List<List<Integer>> levelOrder(TreeNode root) {
		traveltrace(root);
		return list2;
	}

	public void traveltrace(TreeNode node) {
		if (node == null) {
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(node);
		while (!queue.isEmpty()) {
			int len = queue.size();
			while (len > 0) {
				TreeNode temp = queue.poll();
				list.add(temp.val);
				if (temp.right != null) {
					queue.offer(temp.right);
				}
				len--;
			}
			list2.add(list);
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
