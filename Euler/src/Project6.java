
public class Project6 {

	public static void main(String[] args) {
		int sum=0;
		int a[]=new int[100];
		for(int i=0; i<100;i++)
		{
			a[i]=i+1;
		
		}
		for(int i=0;i<99;i++)
		{
			for(int j=i+1;j<100;j++)
			{
				sum+=2*a[i]*a[j];
			}
		}
		
		System.out.println(sum);

	}

}
