import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int s=in.nextInt();
		int x=in.nextInt();
		int flag=true
		for (int i=0;i<x+1;i++)
		{
			if (i==0 && i==x)
					{
					print "YES"
					flag=false
					break
					}
			else if (i==x || i+1==x)
					{
					print "YES"
					flag=false
					break
					}
		}
		if flag==true:
			print "NO"
	}
}