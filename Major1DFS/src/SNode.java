
public class SNode {
	protected int data;
	protected SNode next;
	
	SNode()
	{
		data=0;
		next=null;
	}
	SNode(int x)
	{
		data=x;
	}
	void setData(int x)
	{
		data=x;
	}
	void setNext(SNode x)
	{
		next=x;
	}
	int getData()
	{
		return data;
	}
	SNode getNext()
	{
		return next;
	}
}
