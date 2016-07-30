import java.util.*;
public class JosephusProblem {

	public static void main(String[] args)
	{
		System.out.println("Enter N and M");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		List a=new List();
	
		for(int i=1;i<=n;i++)
		{
			
			a.insert(i);
		}
		
		for(int count=n;count>1;count++)
		{
			for(int j=0;j<m-1;j++)
				a.last=a.last.getNext();
			a.last.setNext(a.last.getNext().getNext());
		}
		a.display();
		if(in!=null)
			in.close();

	}

}
