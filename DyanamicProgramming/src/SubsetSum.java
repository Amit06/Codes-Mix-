class SubsetSum
{
	public static boolean subSum(int[] a,int S)
	{
		boolean[][] soln=new boolean[a.length+1][S+1];
		for(int i=1;i<=S;i++)
			soln[0][i]=false;
		for(int i=0;i<=a.length;i++)
			soln[i][0]=true;
		
		for(int i=1;i<=a.length;i++)
			{
				for(int j=1;j<=S;j++)
				{
					soln[i][j]=soln[i-1][j];
					if (!soln[i][j] && a[i-1]<=j)
						soln[i][j]=soln[i][j] || soln[i][j-a[i-1]];
				}
			}
				
		
		return soln[a.length][S];
	}
	public static void main(String[] args) {
		InputReader in=new InputReader(System.in);
		OutputWriter out=new OutputWriter(System.out);
		int size=in.readInt();
		int[] a=IOUtils.readIntArray(in, size);
		int S=in.readInt();
		out.printLine(subSum(a, S));
		out.flush();
	}
}