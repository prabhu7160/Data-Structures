package SinglyLinkedList;

public class SinglyTester {
	public static void main(String[] args) {
		
		SinglyLinkedList s = new SinglyLinkedList();
		
		s.insert(63);
		s.insert(36);
		s.insert(6);
		s.insert(3);
		s.insert(16);
		s.insert(23);
		s.insert(66);
		s.insert(37);
		s.insert(76);
		s.insert(32);
		s.insert(19);
		s.insert(69);
		s.print();
		System.out.println();
		s.deleteLast();
		s.print();
		
		System.out.println();
		s.descending();
		s.print();
	}
}
