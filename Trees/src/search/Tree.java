package search;
import java.util.*;
public class Tree
{
	ENode root;
	
	public Tree(ENode n)
	{
		root=n;
	}
	public ENode getRoot()
	{
		return root;
	}
	
	public int getHeight(ENode node)
	{
		if (node == null) 
	    {
	        return 0;
	    }
	    else
	    {
	        return 1 +Math.max(getHeight(node.getLeftChild()),
	            getHeight (node.getRightChild()));
	    }
	}
	

	public ENode insert(ENode start,int k,char d)
	{
		if(start==null)
		{
		start=new ENode(k);
		start.setData(d);
		}
		else{
		if(start.getKey()==k)
			System.out.println("Key already present");
		
		else if(start.getKey()>k)
			start.setLeftChild(insert(start.getLeftChild(),k,d));
		else
			start.setRightChild(insert(start.getRightChild(),k,d));
			
			}
		return start;
	}
	
	public ENode rsearch(ENode temp,int k)										// Time : O(h) Space : O(h)
	{
		
		if(temp==null)
			throw new NoSuchElementException("Not Present");
		if(k==temp.getKey())
			return temp;
		if(k<temp.getKey())
			return rsearch(temp.getLeftChild(),k);
		return rsearch(temp.getRightChild(),k);
	}
	public ENode isearch(int k)										// Time:O(h) Space:c
	{
		
		ENode temp=root;
		while(temp!=null)
		{
			if(temp.getKey()==k) return temp;
			else if(temp.getKey()<k) temp=temp.getRightChild();
			else if(temp.getKey()>k) temp=temp.getLeftChild();
		}
		throw new NoSuchElementException("Not Present");
		
	}
	public ENode getMax(ENode start)
	{
		ENode max=null;
		
		while(start!=null)
		{
			max=start;
			start=start.getRightChild();
		}
		return max;
	}
	public ENode psearch(ENode child)
	{
		ENode temp=root;
		ENode par=null;
		while(temp.getKey()!=child.getKey())
		{
			par=temp;
			if(child.getKey()>par.getKey())
				temp=temp.getRightChild();
			else temp=temp.getLeftChild();
		}
		if(par==null){
			par=new ENode(0);
			par.setLeftChild(child);
		}
		return par;
	}
	public ENode delete(ENode start,int k)
	{
		ENode temp=new ENode();
		if(start==null)
			System.out.println("Not present");
		else if(start.getKey()>k)
			start.setLeftChild(delete(start.getLeftChild(),k));
		else if (start.getKey()<k)
			start.setRightChild(delete(start.getRightChild(),k));
		else{
			if(start.getLeftChild()!=null && start.getRightChild()!=null)
			{
				temp=getMax(start.getLeftChild());
				//System.out.println(temp.getKey());
				start.setKey(temp.getKey());
				start.setLeftChild(delete(start.getLeftChild(),start.getKey()));
			}
			else
			{
				
				if(start.getLeftChild()==null)
					temp=start.getRightChild();
				if(start.getRightChild()==null)
					start=start.getLeftChild();
				else start=temp;
			}
		}
		return start;
	}
	public void display()
	{
		Queue<ENode> node=new LinkedList<ENode>();
		ENode temp=root;
		node.add(temp);
		while (true) 
		{
			if(node.peek()!=null){
			temp=node.remove();
			System.out.print(temp.getKey()+" ");
			if(temp.getLeftChild()!=null)
				node.add(temp.getLeftChild());
			if(temp.getRightChild()!=null)
				node.add(temp.getRightChild());
			
			}
			else break;
		}
	}
	

}
