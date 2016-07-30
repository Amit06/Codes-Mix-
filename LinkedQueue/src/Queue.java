import java.util.*;
class Queue
{
	private Node front;
	private Node rear;
	Queue()
	{
		
		front=new Node();
		rear=front;
	}
	Queue(int n)
	{
		Node a=new Node(n);
		front.setNext(a);
		rear=a;
	}
	private boolean isEmpty()
	{
		return front.getNext()==null;
	}
	void enQueue(int n)
	{
		Node a=new Node(n);
		rear.setNext(a);
		rear=a;		
	}
	int deQueue()
	{
		if(isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		front=front.getNext();
		return front.getData();
	}
	void display()
	{
		if(isEmpty())
			System.out.println("Empty Queue");
		Node ptr=front.getNext();
		while(ptr!=rear.getNext())
		{
			System.out.print(ptr.getData()+" ");
			ptr=ptr.getNext();
		}
		System.out.println(); 
	}
}
