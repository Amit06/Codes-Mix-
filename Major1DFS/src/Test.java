import java.util.Random;
public class Test {

	public static void main(String[] args) {
		/*Stack s=new Stack();
		LStack l=new LStack();
		try{
			s.pop();
			l.pop();
			}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		s.push(2);
		l.push(5);
		s.push(6);
		l.push(1);
		l.push(9);
		s.push(6);
		s.display();
		l.display();
		try{
			System.out.println(s.pop());
			System.out.println("LS "+l.pop());
				
			}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		s.display();
		l.display();*/
		
		/*EvaluateExpression e=new EvaluateExpression("3+2");
		e.toPostfix();*/
		Random in=new Random(1);
		int k[][]=new int[3][4];
		for(int i=0;i<3;i++)
			for(int j=0;j<4;j++)
				k[i][j]=in.nextInt(2);
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++)
				System.out.print(k[i][j]+" ");
			System.out.println();
		}
		SparseMatrix s=new SparseMatrix(k);
		//s.display();
		s.Transpose();
		//s.display();
		
		
				
				
	}
}
