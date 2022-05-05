package Hot100;

import java.util.*;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 13:11 2022/5/5
 * @ Description：合并K个升序链表 Hard
 */
public class o23 {
	public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

	public ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0) {
			return null;
		}
		PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(o->-o.val));
		ListNode head = new ListNode(0);
		ListNode cur = head;
		for (ListNode listNode : lists) {
			if (listNode==null) continue;
			queue.add(listNode);
		}
//优先队列,先把链表的头节点都放进去,然后先出队当前优先队列最小的,
// 如果出队的next不为空 把next加入优先队列,然后再进行出队最小的
		while (!queue.isEmpty()) {
			ListNode listNode = queue.poll();
			cur.next = listNode;
			cur = cur.next;
			if (listNode.next != null) {
				queue.add(listNode.next);
			}
		}
		return head;
	}
}
