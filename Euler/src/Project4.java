
public class Project4 {

	public static void main(String[] args) 
	{
	int i=998001;
		int pal=0;
		while(pal==0)
		{
			if(isPal(i) && lFact(i))
			{
				pal=i;
				lFact(i);
				break;
			}
			i--;
		}
		System.out.println(pal);
		
	}
		static boolean isPal(int n)
		{
			String chk=""+n;
			StringBuffer rev=new StringBuffer(chk);
			//System.out.println(rev);
			String reverse=rev.reverse().toString();
			//System.out.println(reverse);
			if(reverse.equals(chk))
				return true;
			return false;
			
		}
		static boolean lFact(int n)
		{
			
			int i=n/2;
			while(i>=1)
			{
				String fact=""+i;
				String fact2=""+n/i;
				if(n%i==0 && fact.length()==fact2.length())
				{
					System.out.println(i+ " "+n/i);
					return true;
					
				}
				i--;
			}
			return false;
		}
				
			
		}

	


