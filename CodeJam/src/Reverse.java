
public class Reverse {
	String s;
	int ctr;
	String r;
	
	Reverse(String n)
	{
		r="";
		s=n;
	}
	void setString(String n)
	{
		s=n;
	}
	String reverse()
	{
		String ns[]=s.split(" ");
		for(int i=ns.length-1;i>=0;i--)
		{
			r=r+" "+ns[i];
		}
		return r;
	}
	

}
