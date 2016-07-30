package binaryTree;

public class Node 
{
	protected char data;
	protected Node left_child;
	protected Node right_child;
	
	public Node()
	{
		data='\0';
		left_child=right_child=null;
	}
	public Node(char a)
	{
		data=a;
	}
	public Node(char a, Node left,Node right)
	{
		data=a;
		left_child=left;
		right_child=right;
	}
	public Node(Node x)
	{
		data=x.getData();
		left_child=x.getLeftChild();
		right_child=x.getRightChild();
	}
	public char getData()
	{
		return data;
	}
	public Node getLeftChild()
	{
		return left_child;
	}
	public Node getRightChild()
	{
		return right_child;
	}
	public void setData(char d)
	{
		data=d;
	}
	public void setLeftChild(Node left)
	{
		left_child=left;
	}
	public void setRightChild(Node right)
	{
		right_child=right;
	}
}
