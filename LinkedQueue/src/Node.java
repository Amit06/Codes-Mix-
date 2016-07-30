
 class Node 
{
	 private int data;
	 private Node next;
	 Node()
	 {
		 data=0;
		 next=null;
	 }
	 Node(int n)
	 {
		 data=n;
		 next=null;
	 }
	 void setData(int n)
	 {
		 data=n;
	 }
	 void setNext(Node a)
	 {
		 next=a;
	 }
	 int getData()
	 {
		 return data;
	 }
	 Node getNext()
	 {
		 return next;
	 }
}

 