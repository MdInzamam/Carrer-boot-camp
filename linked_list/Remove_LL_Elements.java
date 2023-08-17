package linked_list;

import java.util.*;

public class ListNode {
		int data;
		ListNode next;

		public ListNode(int data) {
			this.data = data;
		}

	}

public class Remove_LL_Elements {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return null;
		head.next = removeElements(head.next, val);
		return head.data == val ? head.next : head;
	}
}
