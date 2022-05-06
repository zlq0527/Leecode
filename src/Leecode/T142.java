package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 15:01 2022/5/6
 * @ Description：环形链表2
 * https://leetcode-cn.com/problems/linked-list-cycle-ii/
 * https://programmercarl.com/0142.%E7%8E%AF%E5%BD%A2%E9%93%BE%E8%A1%A8II.html#%E6%80%9D%E8%B7%AF
 */
public class T142 {
	class ListNode {
		int val;
		ListNode next;

		private ListNode() {
		}

		public ListNode(int val) {
			this.val = val;
			next = null;
		}
	}

	public ListNode detectCycle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				ListNode nslow = head;
				while (nslow != fast) {
					nslow = nslow.next;
					fast = fast.next;
				}
				return nslow;
			}
		}
		return null;
	}


}
