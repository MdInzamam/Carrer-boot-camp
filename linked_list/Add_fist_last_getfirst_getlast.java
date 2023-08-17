package linked_list;

public class Add_fist_last_getfirst_getlast {

	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.Display();
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.Display();
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.getatanyindex(2));
		ll.Display();
		System.out.println(ll.removeFirst());
		ll.Display();
		System.out.println(ll.removelast());
		ll.Display();
		System.out.println(ll.removeatanyindex(1));
		ll.Display();
		ll.atanyindex(30,1);
		ll.Display();

	}
}
