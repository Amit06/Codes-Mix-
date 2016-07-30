package Qualification;
import java.util.*;
import java.io.*;;

public class Pancake {

	public static void main(String[] args) {
		int ctr=1;
		int N;
		/*try
		{
			Scanner j=new Scanner(new File("../B.in"));
			PrintWriter writer = new PrintWriter("Pan.txt", "UTF-8");
			N=Integer.parseInt(j.nextLine());
			while(N>0)
			{		
				int eater=j.nextInt();
				ArrayList<Integer> p=new ArrayList<>();
				for(int i=0;i<eater;i++)
				{
					p.add(j.nextInt());
				}
				Collections.sort(p);
				
				int x=work(p);
				writer.println("Case #"+ctr+": "+x);
				System.out.println();
				ctr++;
				N--;
			}
			j.close();
			writer.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		ArrayList<Integer> a=new ArrayList<>(4);
		a.add(9);
		a.add(9);
		a.add(1);
		
		Collections.sort(a);
		System.out.println(work(a));
		

	}
	public static int work(ArrayList<Integer> q)
	{
		int r=0;
		int ctr=0;
		int max=0;
		int prevmax=-1;
		while(true){
			max=q.get(q.size()-1);
			prevmax=q.indexOf(max)-1;
			int noc=q.lastIndexOf(max)-q.indexOf(max)+1;
			int chk=(prevmax>=0 && Math.ceil(max/2)<prevmax)?q.get(prevmax):(int)Math.ceil(max/2);
			if((chk+noc+ctr)<max)
			{
					
				for(int j=q.indexOf(max);j<=q.lastIndexOf(max);j++)
					{q.set(j, (int)Math.floor(max/2));
					q.add((int)Math.ceil(max/2));
					
					}
					/*for(int k=0;k<q.size();k++)
					System.out.print(q.get(k)+" ");}*/
				
				ctr++;
				r=chk+noc;
				
				Collections.sort(q);
			
			}
			else break;
			}
		return r;
	}	

}