
package binaryTree;

public class BT	// Using List
{
	protected Node root;
	public BT()
	{
		root=null;
	}
	public BT(char x)
	{
		root =new Node(x);
	}
	public BT(Node n)
	{
		root=n;
	}
	public Node getRoot()
	{
		return root;
	}
	public boolean isEmpty()
	{
		return root==null;
	}
	public Node getLeft(Node n)
	{
		return n.getLeftChild();
	}
	public Node getRight(Node n)
	{
		return n.getRightChild();
	}
	public void inOrder(Node node)
	{
		  if(node!=null)
		  {
			  inOrder(node.getLeftChild());
			  System.out.print(node.getData());
			  inOrder(node.getRightChild());
		  }
	}
	public void preOrder(Node node)
	{
		if(node!=null){
		System.out.print(node.getData());
		preOrder(node.getLeftChild());
		preOrder(node.getRightChild());}
	}
	public void postOrder(Node node)
	{
		if(node!=null){
		postOrder(node.getLeftChild());
		postOrder(node.getRightChild());
		System.out.print(node.getData());}
	}
	public void extend(Node left,Node right)
	{
		root.setLeftChild(left);
		root.setRightChild(right);
				
	}
	
}
