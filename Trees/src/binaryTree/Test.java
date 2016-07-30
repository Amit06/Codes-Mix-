package binaryTree;
import java.util.*;
public class Test {

	public static void main(String[] args) 
	{
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter root data");
		Node root=new Node(in.next().charAt(0));
		BT b=new BT(root);
		Node left,right;
		left=new Node(in.next().charAt(0));
		right=new Node(in.next().charAt(0));
		b.extend(left, right);
		b.inOrder(b.getRoot());
		System.out.println();
		b.preOrder(b.getRoot());
		System.out.println();
		b.postOrder(b.getRoot());
		if(in!=null)
			in.close();
	}

}
