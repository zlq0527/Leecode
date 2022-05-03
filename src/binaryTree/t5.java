package binaryTree;

import java.util.*;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 13:55 2022/5/3
 * @ Description：N叉树的层序遍历
 */
public class t5 {
	class Node {
		public int val;
		public List<Node> children;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}

	}
	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> list = new ArrayList<>();
		if (root == null) {
			return list;
		}
		Deque<Node> deque = new LinkedList<>();
		deque.offer(root);
		while (!deque.isEmpty()) {
			List<Integer> list1 = new ArrayList<>();
			int len = deque.size();
			for (int i = 0; i < len; i++) {
				Node node = deque.poll();
				list1.add(node.val);
				int csize = node.children.size();
				for (int j = 0; j < csize; j++) {
					deque.offer(node.children.get(j));
				}
			}
			list.add(list1);
		}
		return list;
	}
}
