import java.util.*;
import java.io.*;

public class Test {

	public static void main(String[] args) 
	{
		int N;
		int ctr=1;
		Reverse r;
		try
		{
			Scanner in=new Scanner(new File("../B.in"));
			PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
			N=Integer.parseInt(in.nextLine());
			while(N>0)
			{		
				r=new Reverse(in.nextLine());
				writer.println("Case #"+ctr+": "+r.reverse());
				N--;
				ctr++;
			}
			in.close();
			writer.close();
		}
		catch(Exception e)
		{
			System.out.println("Error "+e.getMessage());
		}
		
		
		
		
	}

}
