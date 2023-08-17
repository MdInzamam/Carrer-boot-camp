package Link_list;

//import Link_list.LinkedList.Node;

public class Linked_list {

	public static void main(String[] args) throws Exception {

		LinkedList ll = new LinkedList();
		ll.addfirst(10);
		ll.addfirst(20);
		ll.addfirst(30);
		 ll.Display();
		ll.addlast(40);
		ll.addlast(50);
		ll.addlast(60);
		ll.addlast(70);
		ll.addlast(80);
		ll.Display();
		System.out.println(ll.getfirst());
		System.out.println(ll.getlast());
		System.out.println(ll.removeFirst());
		ll.Display();
		System.out.println(ll.removelast());
		ll.Display();
		System.out.println(ll.removeatindex(3));
		ll.Display();
		ll.addatindex(2, 2);
		ll.Display();
		System.out.println(ll.reverseList(null));
		
	}
}