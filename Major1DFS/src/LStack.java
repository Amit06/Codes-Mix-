import java.util.*;

public class LStack {
	SNode top;
	
	LStack()
	{
		top=null;
	}
	LStack(SNode x)
	{
		top=x;
	}
	void push(int x)
	{
		SNode n=new SNode(x);
		n.setNext(top);
		top=n;
	}
	void peek()
	{
		System.out.println(top.getData());
	}
	int pop()
	{
		if(top==null)
		{
			throw new NoSuchElementException("Underflow");
		}
		int temp=top.getData();
		top=top.getNext();
		return temp;
	}
	void display()
	{
		SNode start=top;
		while(start!=null)
		{
			System.out.print(start.getData()+" ");
			start=start.getNext();
		}
		System.out.println();
	}

}
