package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 17:33 2022/5/5
 * @ Description：T707设计链表
 *
 */
public class T707 {
	class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}
	}

	int size;
	ListNode head;

	public T707() {
		size = 0;
		head = new ListNode(0);
	}

	public int get(int index) {
		if (index < 0 || index >= size) {
			return -1;
		}
		ListNode node = head;
		for (int i = 0; i <= index; i++) {
			node = node.next;
		}
		return node.val;
	}

	public void addAtHead(int val) {
		addAtIndex(0, val);
	}

	public void addAtTail(int val) {
		addAtIndex(size,val);
	}

	public void addAtIndex(int index, int val) {
		if (index > size) {
			return;
		}
		if (index < 0) {
			index = 0;
		}
		size++;
		//找到要插入节点的前驱
		ListNode pred = head;
		for (int i = 0; i < index; i++) {
			pred = pred.next;
		}
		ListNode toAdd = new ListNode(val);
		toAdd.next = pred.next;
		pred.next = toAdd;
	}

	public void deleteAtIndex(int index) {
		if (index < 0 || index >= size) {
			return;
		}
		size--;
		ListNode pred = head;
		for (int i = 0; i < index; i++) {
			pred = pred.next;
		}
		pred.next = pred.next.next;
	}

//	["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
//			[[],[1],[3],[1,2],[1],[1],[1]]
}
