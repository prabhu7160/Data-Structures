package CircularLinkedList;

public class CircularQueue {

	int[] arr;
	int front;
	int rear;
	int max;
	
	
	public CircularQueue(int size) {
		
		max=size;
		arr = new int[max];
		this.front = -1;
		this.rear = -1;
	}
	public void enqueue(int key)
	{
		
		if(isFull())
			System.out.println("Queue full, dequeue some elements");
		
		else if(isEmpty())
			front++;
		
		rear = (rear+1)%max;
		arr[rear]=key;
//		System.out.println("Enqueue:-"+front+","+rear);
		
	}
	public void dequeue()
	{
		
		
		
		if(isEmpty())
			System.out.println("Queue empty");
		
		if(front==rear)
			front=rear=-1;
		
		arr[front]=0;
		front = (front+1)%max;
		
		
		
		System.out.println("Dequeue:-"+front+","+rear);
		
	}
	public boolean isEmpty()
	{
//		System.out.println("isEmpty:-"+front+","+rear);
		if(front==-1)
		{
			return true;
		}
		return false;
		
	}
	public boolean isFull()
	{
//		System.out.println("isFull:-"+front+","+rear);
		if(front == (rear+1)%max)
			return true;
		return false;
		
	}
	public void print()
	{
		System.out.println();
		for(int i=0;i<max;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		
		CircularQueue c = new CircularQueue(5);
		
		c.enqueue(8);
		c.enqueue(3);
		c.enqueue(12);
		c.enqueue(14);
		c.enqueue(4);
		c.print();
		
		c.dequeue();
		c.dequeue();
		c.dequeue();
		c.dequeue();
		c.print();
		
		c.print();
		
			
	}
	
}
