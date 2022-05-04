package binaryTree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 14:33 2022/5/3
 * @ Description：
 */
public class t7 {
	class Node {
		public int val;
		public Node left;
		public Node right;
		public Node next;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, Node _left, Node _right, Node _next) {
			val = _val;
			left = _left;
			right = _right;
			next = _next;
		}
	}

	public Node connect(Node root) {
		Deque<Node> deque = new LinkedList<>();
		if (root == null) {
			return root;
		}
		deque.offer(root);
		while (!deque.isEmpty()) {
			int len = deque.size();
			Node cur = deque.poll();
			if (cur.left != null) deque.offer(cur.left);
			if (cur.right != null) deque.offer(cur.right);
			for (int i = 1; i < len; i++) {
				Node node = deque.poll();
				if (node.left != null) {
					deque.offer(node.left);
				}
				if (node.right != null) {
					deque.offer(node.right);
				}
				cur.next = node;
				cur = node;
			}
		}
		return root;
	}
}
