import java.util.*;
class TestExpression {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter::");
		Expression E=new Expression(in.next());
		//System.out.println(E.getToken());
		E.toPostfix();
		E.displayPostFix();
		System.out.println();
		E.evaluatePostfix();
		if(in!=null)
			in.close();
	}

}
