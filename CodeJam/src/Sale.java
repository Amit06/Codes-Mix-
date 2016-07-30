
public class Sale {
	
	int a[];
	int a1,a2;
	int p1,p2;
	int c;
	Sale(int[] n,int credit)
	{	
		
		c=credit;
		a=n;
		a1=0;
		a2=0;
	}
	boolean check(int x,int y)
	{
		//System.out.println(x+y);
		if(x+y<=c && x+y>a1+a2){
			
			a1=x;
			a2=y;
			return true;
		}
		else return false;
	}
	void getResult()
	{	
		
		for(int i=0;i<a.length;i++)
			for(int j=i+1;j<a.length;j++)
			{
				if(check(a[i],a[j]))
				{
					
					p1=i+1;p2=j+1;
				}
			}
	}
			
	}
	
