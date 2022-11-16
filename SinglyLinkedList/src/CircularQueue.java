import java.util.Arrays;

public class CircularQueue {
	private int[] queueData;
	private int front;
	private int rear;
	private int queueSize;

	public CircularQueue(int n) {
		queueData = new int [n];
		queueSize = n;
		front = 0;
		rear = 0;
	}

	public void AddQ(int element) {
		if (IsFull())
			// throw Exception;
			return;

		rear = (rear + 1) % queueSize;
		queueData[rear] = element;
	}

	public int DeleteQ() {
		if (IsEmpty())
			// throw Exception;
			return -1;

		front = (front + 1) % queueSize;
		int element = queueData[front];
		queueData[front]=0;
		
		return element;
	}

	public boolean IsEmpty() {
		if (front == rear)
			return true;
		return false;
	}

	public boolean IsFull() {
		if ((rear + 1) % queueSize == front)
			return true;
		return false;
	}
	public String toString()
	{
		return Arrays.toString(queueData);
	}
	public static void main(String[] args) {
		CircularQueue c = new CircularQueue(4);
		
		c.AddQ(5);
		c.AddQ(3);
		
		c.AddQ(9);
		c.AddQ(87);
		System.out.println(c);
		
		
		System.out.println(c.DeleteQ());
		System.out.println(c.DeleteQ());
		
		System.out.println(c);
		c.AddQ(17);
		c.AddQ(23);
		c.AddQ(19);
		System.out.println(c);
	}

}
