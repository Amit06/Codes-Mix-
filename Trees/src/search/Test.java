package search;

public class Test {
	public static void main(String args[])
	{
		ENode a=new ENode(4);
		
		Tree t=new Tree(a);
		System.out.println("\n"+t.getHeight(t.getRoot()));
		System.out.println(t.getRoot().getKey());
		
		t.insert(t.getRoot(),5, 'd');
		t.insert(t.getRoot(),3, 'e');
		//t.insert(t.getRoot(), 1, 'o');
		t.display();
		
		t.delete(t.getRoot(), 4);
		System.out.println();
		t.display();
		t.insert(t.getRoot(),5,'d');
		t.display();
		
		
	}

}
