package SinglyLinkedList;

public class SinglyLinkedList {
	Node head;
	Node tail;
	
	public void insert(int key)
	{
		Node newNode = new Node(key);
		if(head==null)
		{
			head = newNode;
			tail=newNode;
			return;
		}
		if(key<head.data)
		{
			newNode.next=head;
			head = newNode;
			return;
		}
		if(key>tail.data)
		{
			tail.next=newNode;
			tail=newNode;
			newNode.next=null;
			
			return;
		}
		Node current = head;
		Node prev = null;
		while(current!=null)
		{
			
			if((prev!=null)&&(key>prev.data)&&(key<current.data))
			{
				
				prev.next=newNode;
				newNode.next=current;
				return;
			}
			prev = current;
			current = current.next;
		}
	}
	public void print()
	{
		Node current = head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
	}
	
	public void deleteFirst()
	{
		head=head.next;
	}
	public void deleteLast()
	{
		Node current = head;
		Node prev = null;
		while(current.next!=null)
		{
			prev=current;
			current=current.next;
		}
		tail=prev;
		prev.next=null;
		
		System.out.println(tail.data);
	}
	public void descending()
	{
		Node current = head;
		Node prev = null;
		Node next = null;
		
		while(current!=null)
		{	
			next = current.next;
			current.next=prev;
			prev = current;
			current=next;
		}
		head=tail;
	}
	
}
