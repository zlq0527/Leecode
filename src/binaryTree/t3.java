package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 13:02 2022/5/3
 * @ Description：二叉树的右视图,还是使用二叉树的层序遍历,然后只保留最右边的值.
 * 选择用两个list实现,第一个list保存每一层的值,第二个list用于添加每一层最右边的值 这样就可以实现右视图的情况.
 */
public class t3 {
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

	List<Integer> list = new ArrayList<>();
	List<Integer> list2 = new ArrayList<>();

	public List<Integer> rightSideView(TreeNode root) {
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
				if (temp.left != null) {
					queue.offer(temp.left);
				}
				if (temp.right != null) {
					queue.offer(temp.right);
				}
				len--;
			}
			list2.add(list.get(list.size() - 1));
		}
	}

}
