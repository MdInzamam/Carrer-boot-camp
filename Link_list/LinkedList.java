package Link_list;

public class LinkedList {
	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	private Node head;
	private int size;
	private Node tail;

	// Add First
	public void addfirst(int item) {
		Node nn = new Node(item);
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;

		} else {
			nn.next = this.head;
			this.head = nn;
			this.size++;

		}

	}

	// Add Last
	public void addlast(int item) {
		if (this.size == 0) {
			addfirst(item);
		} else {
			Node nn = new Node(item);
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}
	}

	// Add at any index
	public void addatindex(int item, int k) throws Exception {

		if (k < 0 || k > size) {
			throw new Exception("Index out of Bound");
		}
		if (k == 0) {
			addfirst(item);
		} else if (k == size) {
			addlast(item);
		} else {
			Node nn = new Node(item);
			Node k_1th = GetNode(k - 1);
			nn.next = k_1th.next;
			k_1th.next = nn;
			this.size++;
		}
	}

	// Get First
	public int getfirst() throws Exception {
		if (this.head == null) {
			throw new Exception("Linkedlsit is Empty");
		}
		return this.head.data;
	}

	// Get Last
	public int getlast() throws Exception {
		if (this.head == null) {
			throw new Exception("Linkedlsit is Empty");
		}

		return this.tail.data;
	}

	// Get at any Index
	public int getatindex(int k) throws Exception {
		return GetNode(k).data;
	}

	private Node GetNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Index out of Bound ");
		}
		Node temp = head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// Remove First
	public int removeFirst() throws Exception {
		if (this.head == null) {
			throw new Exception("Linkedlsit is Empty");
		}
		Node temp = this.head;
		this.head = this.head.next;
		temp.next = null;
		this.size--;
		return temp.data;
	}

	// Remove Last
	public int removelast() throws Exception {
		if (this.head == null) {
			throw new Exception("Linkedlsit is Empty");
		}
		if (this.size == 1) {
			return removeFirst();
		}

		Node temp = GetNode(this.size - 2);
		int rv = tail.data;
		this.tail = temp;
		this.tail.next = null;
		this.size--;
		return rv;

	}

	// Remove Linked List Elements
	public Node removeElements(Node head, int data) {
		while (head != null && head.data == data) {
			head = head.next;
		}
		if (head == null) {
			return head;
		}
		Node temp = head;
		while (temp.next != null) {
			if (temp.next.data == data) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}
		return head;
	}

	// fylodcycleremoval
	public void fylodcycleremoval() {
		Node Meetup = hascycl();
		if (Meetup == null) {
			return;
		}
		Node fast = Meetup;
		Node start = head;
		while (start != fast) {
			fast = fast.next;
			start = start.next;
		}
		fast.next = null;
	}
	public Node hascycl() {
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				return fast;
			}
		}
		return null;
	}

	
	// circular LinkedList
	public void circular() {
		this.tail.next = this.head;
	}

	// cycle
	public void cycle() {
		this.tail.next = this.head.next;
	}

	public boolean hascycle() {
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}

	// Inter Section of two LinkedList
	public Node getIntersectionNode(Node headA, Node headB) {
		Node A = headA;
		Node B = headB;
		while (A != B) {
			if (A == null) {
				A = headB;
			} else {
				A = A.next;
			}
			if (B == null) {
				B = headB;
			} else {
				B = B.next;
			}
		}
		return A;
	}

	// Reverse LinkedList
	public Node reverseList(Node head) {
		Node current = head;
		Node Previus = null;
		while (current != null) {
			Node NextNode = current.next;
			current.next = Previus;
			Previus = current;
			current = Previus;
		}
		return Previus;
	}

	// Remove at any index
	public int removeatindex(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Index out of Bound");
		}
		if (k == 0) {
			return removeFirst();
		} else if (k == this.size - 1) {
			return removelast();
		} else {
			Node kth = GetNode(k);
			Node k_1th = GetNode(k - 1);
			k_1th.next = kth.next;
			kth.next = null;
			this.size--;
			return kth.data;
		}
	}

	// Middle node of linklist by using fast and slow
	public Node middle_node(Node head) {
		Node fast = head;
		Node slow = head;
		if (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	// Linked list Display
	public void Display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("Null");
	}
}