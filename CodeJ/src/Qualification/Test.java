package Qualification;


import java.io.File;
import java.io.PrintWriter;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);		
		int N;
		int ctr=1;
		/*try
		{
			Scanner j=new Scanner(new File("../B.in"));
			PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
			N=Integer.parseInt(j.nextLine());
			while(N>0)
			{		
				int max=Integer.parseInt(j.next());
				int count[]=new int[max+1];
				String s=j.next();
				for(int i=0;i<s.length();i++)
				{
					count[i]=s.charAt(i)-'0';
					
				}
				writer.println("Case #"+ctr+": "+work(max,count));
				ctr++;
				N--;
			}
			j.close();
			writer.close();
		}
		catch(Exception e)
		{
			System.out.println("Error "+e.getMessage());
		}*/
		String s=in.next();
		String a="";
		int X=in.nextInt();
		for(int i=1;i<=X;i++)
			a+=s;
	
	
		String chk="";
		int ipos,jpos;
		int kpos=ipos=jpos=-1;
		for(int j=a.length()-1;j>=0;j--)
		{
			chk=a.charAt(j)+chk;
			System.out.println(chk);
			if(evaluate(chk).charAt(0)=='-' && chk.charAt(0)=='-')
				{
					chk+=evaluate(chk);
					chk.replaceAll("-", "");
				}
			System.out.println(chk);
			if(chk.equals("k"))
			{
				kpos=j;
				System.out.println(j);
				break;
			}
		}
		chk="";
		if(kpos!=-1)
		{
			for(int j=kpos-1;j>=0;j--)
			{
				chk=a.charAt(j)+chk;
				System.out.println(chk);
				chk=evaluate(chk);
				System.out.println(chk);
				if(chk.equals("j"))
				{
					jpos=j;
					System.out.println(j);
					break;
				}
			}
			chk="";
			if(jpos!=-1)
			{
				for(int j=jpos-1;j>=0;j--)
				{
					chk=a.charAt(j)+chk;
					System.out.println(chk);
					chk=evaluate(chk);
					System.out.println(chk);
					if(chk.equals("i"))
					{
						System.out.println(j);
						ipos=j;
					}
				}
				if(ipos==-1)
					System.out.println("False");
				if(ipos==0)
					System.out.println("True");
							
				
			}
			else
			{
				System.out.println("false");
			}
		}
		else
		{
		  System.out.println("false");
			
		}
	}
	public static String evaluate(String a)
	{
		int flag=0;
		String m[][]=new String[4][4];
		m[0][0]="1";
		m[0][1]="i";
		m[0][2]="j";
		m[0][3]="k";
		m[1][0]="i";
		m[1][1]="-1";
		m[1][2]="k";
		m[1][3]="-j";
		m[2][0]="j";
		m[2][1]="-k";
		m[2][2]="-1";
		m[2][3]="i";
		m[3][0]="k";
		m[3][1]="j";
		m[3][2]="-i";
		m[3][3]="-1";
		int col;
		int row=col=0;
		if(a.length()==1)
			return a;
		else if(a.length()==2){
			switch(a.charAt(0))
			{
			
			case '1':row=0;break;
			case 'i':row=1;break;
			case 'j':row=2;break;
			case 'k':row=3;break;
			case '-':return a;
			}
			switch(a.charAt(1))
			{
			case '1':col=0;break;
			case 'i':col=1;break;
			case 'j':col=2;break;
			case 'k':col=3;break;
			}
			return m[row][col];}
		else if(a.length()==3){
			a.replace('-', '\0');
			switch(a.charAt(0))
			{
			
			case '1':row=0;break;
			case 'i':row=1;break;
			case 'j':row=2;break;
			case 'k':row=3;break;
			case '-':return a;
			}
			switch(a.charAt(1))
			{
			case '1':col=0;break;
			case 'i':col=1;break;
			case 'j':col=2;break;
			case 'k':col=3;break;
			}
			if( m[row][col].charAt(0)=='-')
				return m[row][col];
			return "-"+m[row][col];
		}
		else return m[row][col];
	}
}
