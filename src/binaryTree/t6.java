package binaryTree;

import java.util.*;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 14:22 2022/5/3
 * @ Description：Leetcode 515
 * 在每个树行中找最大值
 * 即是求二叉树每一层的最大值, 注意每个节点值的取值范围.
 * 二叉树的节点个数的范围是 [0,104]
 * -2^31 <= Node.val <= 2^31 - 1
 * https://leetcode-cn.com/problems/find-largest-value-in-each-tree-row/
 */
public class t6 {
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

	public List<Integer> largestValues(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		Deque<TreeNode> deque = new LinkedList<>();
		if (root == null) {
			return list;
		}
		deque.offer(root);
		while (!deque.isEmpty()) {
			int len = deque.size();
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < len; i++) {
				TreeNode temp = deque.poll();
				max = Math.max(temp.val, max);
				if (temp.left != null) {
					deque.offer(temp.left);
				}
				if (temp.right != null) {
					deque.offer(temp.right);
				}
			}
			list.add(max);
		}
		return list;
	}
}
