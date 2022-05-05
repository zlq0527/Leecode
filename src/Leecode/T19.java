package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 21:43 2022/5/5
 * @ Description：
 */
public class T19 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head.next == null) {
			return new ListNode(0);
		}
		int res = 0;
		ListNode l = head;
		ListNode r = head;
		int len = n;
		while (n != 0) {
			r = r.next;
			n--;
		}
		while (r.next != null) {
			l = l.next;
			r = r.next;
		}
		l.next = l.next.next;
		return head;

	}

}
