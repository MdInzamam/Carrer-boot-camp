package linked_list;

//import java.util.LinkedList;

public class LinkedList {
	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	// Add First
	public void addFirst(int item) {
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

	// add Last
	public void addLast(int item) {
		if (this.size == 0) {
			addFirst(size);
		} else {
			Node nn = new Node(item);
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}
	}

	// add at any index
	public void atanyindex(int item, int k) throws Exception {
		if (k < 0 || k == size) {
			throw new Exception("Index out of bound");
		}
		if (k == 0) {
			addFirst(item);
		} else if (k == this.size) {
			addLast(item);
		} else {
			Node nn = new Node(item);
			Node k_1th = getNode(k - 1);
			nn.next = k_1th.next;
			k_1th.next = nn;
			this.size++;			
		}
	}

	// get First Index
	public int getFirst() {
		if (this.head == null) {
			System.out.println("LinkedList is empty");
		}
		return this.head.data;
	}

	// get Last Index
	public int getLast() {
		if (this.head == null) {
			System.out.println("LinkedList is empty");
		}
		return this.tail.data;
	}

	// get at any Index
	public int getatanyindex(int k) throws Exception {
		return getNode(k).data;
	}

	private Node getNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Index out of Bound");
		}
		Node temp = head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// Remove Fist
	public int removeFirst() throws Exception {
		if (this.head == null) {
			throw new Exception("Node is empty");
		}
		Node temp = this.head;
		this.head = this.head.next;
		temp.next = null;
		this.size--;
		return temp.data;
	}

	// remove Last
	public int removelast() throws Exception {
		if (this.head == null) {
			throw new Exception("Node is empty");
		}
		if (this.size == 1) {
			return removeFirst();
		}
		Node temp = getNode(this.size - 2);
		int remove = tail.data;
		this.tail = temp;
		this.tail.next = null;
		this.size--;
		return remove;
	}

	// remove at any index
	public int removeatanyindex(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Index out of bound");
		}
		if (k == 0) {
			return removeFirst();
		}
		if (k == this.size - 1) {
			return removelast();
		} else {
			Node kth = getNode(k);
			Node k_1th = getNode(k - 1);
			k_1th.next = kth.next;
			kth.next = null;
			this.size--;
			return kth.data;
		}
	}

	// Display
	public void Display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.print("Null");
		System.out.println();
	}
}
