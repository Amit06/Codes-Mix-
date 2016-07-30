package search;

public class ENode  {
	
	protected int key;
	protected char data;
	ENode left_child;
	ENode right_child;
	public ENode()
	{
		key=-1;
		data='\0';
		left_child=null;
		right_child=null;
	}
	public ENode(char d,int k)
	{
		data=d;
		key=k;
		left_child=null;
		right_child=null;
	}
	public ENode(int k)
	{
		key=k;
		data='\0';
		left_child=null;
		right_child=null;
	}
	
	public int getKey()
	{
		
		return key;
	}
	public void setKey(int k)
	{
		key=k;
	}
	public char getData(){
		return data;
	}
	public void setData(char x)
	{
		data=x;
	}
	public void setLeftChild(ENode x)
	{
		left_child=x;
	}
	public void setRightChild(ENode x)
	{
		right_child=x;
	}
	public ENode getLeftChild()
	{	
		
		return left_child;
	}
	public ENode getRightChild()
	{
		return right_child;
	}
}