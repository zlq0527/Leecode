package binaryTree;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 13:18 2022/5/3
 * @ Description：二叉树的平均值
 * https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/
 */
public class t4 {

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

	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> list = new ArrayList<>();
		Deque<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int len = queue.size();
			double levelsum = 0.0;
			for (int i = 0; i < len; i++) {
				TreeNode temp = queue.poll();
				levelsum += temp.val;
				if (temp.left != null) {
					queue.add(temp.left);
				}
				if (temp.right != null) {
					queue.add(temp.right);
				}
			}
			list.add(levelsum / len);
		}
		return list;
	}


}
