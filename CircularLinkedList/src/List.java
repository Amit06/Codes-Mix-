import java.util.NoSuchElementException;
class List 
{
	Node last;
	List()
	{
		last=null;
	}
	boolean isEmpty()
	{
		return last==null;
	}
	void insert(int n)   // Sorted list is maintained
	{
		Node temp=new Node(n);
		if(isEmpty())
		{
			last=temp;
			last.setNext(last);
			return;
		}
		if(last.getData()<n)		//Insertion at last
		{
			temp.setNext(last.getNext());
			last.setNext(temp);
			last=temp;
			return;
		}//anywhere else
		Node prev=last;
		Node cur=last.getNext();
		while(cur.getData()<n)
		{
			prev=cur;
			cur=cur.getNext();
			
		}
		
		temp.setNext(prev.getNext());
		prev.setNext(temp);
		
	}
	int delete(int data)
	{
		if(last==null)
		 throw new NoSuchElementException("Underfow Exception");
		if(last.getNext()==last && last.getData()==data)  // only 1 node and that node to be deleted
			{
				int temp=last.getData();
				last=null;
				return temp;
			}
			
		Node prev=last;
		Node cur=last.getNext();
		while(cur.getData()!=data)
		{
			prev=cur;
			cur=cur.getNext();
			if(cur==last.getNext())
				break;
		}
		if(cur==last.getNext() && cur.getData()!=data)
			throw new NoSuchElementException("Element not found");
		prev.setNext(cur.getNext());
		if(cur==last)			//add this condition if last node is deleted
			last=prev;
		return cur.getData();			
	}
	void display()
	{
		if(isEmpty())
		{
			System.out.println("Empty List");
			return;
		}
		if(last.getNext()==null)
			System.out.println(last.getData());
		Node temp=last.getNext();
		while(temp!=last)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println(temp.getData());
			
	}
}
