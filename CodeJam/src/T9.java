import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class T9 {
	 int a[];

	 void m() 
	{
		int entry=2;
		a=new int[26];
		for(int i=0;i<26;)
		{
			a[i]=entry;
			a[i+1]=a[i]*10+a[i];
			a[i+2]=a[(i+1)]*10+a[i];
			entry++;
			if(a[i]==7 || a[i]==9)
			{
				a[i+3]=a[(i+2)]*10+a[i];
				i=i+4;
				continue;
			}
			i=i+3;
		}
	}
	
	public static void main(String args[])
	{
		T9 t=new T9();
		t.m();
		int prev=0;
		boolean is_prev=false;
		int N;
		int ctr=1;
		String code="";
		try
		{
			Scanner in=new Scanner(new File("../B.in"));
			PrintWriter writer = new PrintWriter("Output.txt", "UTF-8");
			N=Integer.parseInt(in.nextLine());
			
			while(N>0)
			{		
				String msg=in.nextLine();
				for(int i=0;i<msg.length();i++)
				{
					
					char e=msg.charAt(i);
					
					if(e==' ')
					{
						if(is_prev)
						{
						code+=" ";
						}
						else is_prev=true;
						
						code+="0";						
						
						continue;
						
					}
						is_prev=false;
						int x=(int)e-'a';
						if(t.a[x]%10==prev%10)
							code+=" ";
						code+=t.a[x];
						prev=t.a[x];
				}
				writer.println("Case #"+ctr+": "+code);
				code="";
				is_prev=false;
				prev=0;
				N--;
				ctr++;
		}
			
		in.close();
		writer.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Error "+e.getCause());
		}
		
	}

}
