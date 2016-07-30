import java.util.*;

class Stack {
	ArrayList<Integer> stack ;
	int top;
	
	Stack()
	{
		stack=new ArrayList<>();
		top=-1;
	}
	void push(int x)
	{
		stack.add(x);
		top++;
		
	}
	int peek()
	{
		return stack.get(top);
	}
	int pop()
	{
		if(isEmpty())
			throw new NoSuchElementException("Underflow");
		int temp=stack.get(top);
		stack.remove(top);
		top--;
		return temp;
	}
	boolean isEmpty()
	{
		return top==-1;
	}
	
	void display()
	{
		for(int i:stack)
			System.out.print(i+" ");
		System.out.println();
	}

}
