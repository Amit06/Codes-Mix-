
public class SparseMatrix {
	Term a[];
	SparseMatrix()
	{
		a=new Term[1];
		a[0].row=0;
		a[0].col=0;
		a[0].value=0;
		
	}
	SparseMatrix(int b[][])
	{
		int t=1;
		a=new Term[b.length*b[0].length];
		a[0].row=b.length;
		a[0].col=b[0].length;
		
		for(int i=0;i<b.length;i++)
			for(int j=0;j<b[0].length;j++)
			{
				if(b[i][j]!=0){
					a[t].row=i;
					a[t].col=j;
					a[t].value=b[i][j];
					t++;}
					
			}
		System.out.println(b.length+" "+b[0].length);
		
	}
	SparseMatrix(int l)
	{
		a=new Term[l];
		a[0].value=l;
	}
	
	SparseMatrix Transpose()
	{
		SparseMatrix ret=new SparseMatrix(a[0].value);
		ret.a[0].row=a[0].col;
		ret.a[0].col=a[0].row;
		int rowPos[]=new int[a[0].col];
		int startpos[]=new int[a[0].col];
		for(int i:rowPos)
			rowPos[i]=0;
		for(int i=1;i<=a[0].value;i++)
			rowPos[a[i].col]++;
		startpos[0]=1;
		for(int i=1;i<a[0].col;i++)
			startpos[i]=startpos[i-1]+rowPos[i-1];
		for(int i=1;i<=a[0].value;i++)
		{
			int j=startpos[a[i].col]++;
			ret.a[j].row=a[i].col;
			ret.a[j].col=a[i].row;
			ret.a[j].value=a[i].value;
		}
		return ret;
	}
	void display()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i].row+" "+a[i].col+" "+a[i].value);
		}
	}
}