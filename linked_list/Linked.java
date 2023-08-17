package linked_list;

import java.util.*;

public class Linked {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = sc.nextInt();
        
        // Create the linked list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            curr.next = new ListNode(x);
            curr = curr.next;
        }
        removeElements
    }

}
