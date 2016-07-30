
/* Circular Queue */

import java.util.*;
class Queue 
{
	private int queue[];
	private int front;
	private int rear;
	Queue()
	{
		queue=new int[1];
		front=0;
		rear=0;
	}
	Queue(int n)
	{
		queue=new int[n];
		front=0;
		rear=0;
	}
	private void doDoubling()
	{
		int temp[]=new int[2*getSize()];
		System.arraycopy(queue, 0, temp, 0, getSize());
		queue=temp;
	}
	private boolean isEmpty()
	{
		return front==rear;
	}
	private boolean isFull()
	{
		return (rear+1)%getSize()==front;
	}
	private int getSize()
	{
		return queue.length;
	}
	void enQueue(int n)
	{
		if(isFull())
			doDoubling();
		rear=(rear+1)%getSize();
		queue[rear]=n;
		return;		
	}
	int deQueue()
	{
		if(isEmpty())
			throw new NoSuchElementException("Underflow exception");
		front=(front+1)%getSize();
		
		return queue[front];
	}
	void display()
	{
		if(isEmpty())
		{
			System.out.println("Empty Queue");
			return;
		}
		
		int ind=(front+1)%getSize();
		while(ind!=rear)
		{
			System.out.print(queue[ind]+" ");
			ind=(ind+1)%getSize();
		}
		System.out.print(queue[ind]);
		System.out.println();
		
	}
		
}