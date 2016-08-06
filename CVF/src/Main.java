/*
 *  @author Amit
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

class Trump
{
	public static void main(String[] args)
	{
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		int tc=in.readInt();
		for(int test=0;test<tc;test++)
		{
			
			int n=in.readInt();
			String ps=in.readString();
			String qs=in.readString();
			long p=Long.parseLong(ps);
			long q=Long.parseLong(qs);
			
			int i=0;
			int ctr=0;
			int[] arr=IOUtils.readIntArray(in, n);
			Arrays.sort(arr);
			while(i<n && (p>0 || q>0) )
					{
						System.out.println("Here");
						if (arr[i]==1 && p>0)
						{
							p-=1;
							ctr+=1;
							i++;
							System.out.println("1");
							continue;
								
						}
						if (arr[i]==1 && p==0)
						{
							i++;
							System.out.println("1");
							continue;
								
						}
						if (arr[i]==2 && q>0)
						{
							ctr+=1;
							i++;
							q-=1;
							System.out.println("1");
							continue;
						}
						if (arr[i]==2 && q==0 && p>1)
						{
							ctr+=1;
							i++;
							p-=2;
							System.out.println("2");
							continue;
						}
						if (arr[i]==2 && q==0 && p==0)
						{
							
							System.out.println("3");
							break;
							
						}
						if (arr[i]>(p+2*q)){
							System.out.println("#4");
							break;
						}
						
						int ch=arr[i]/2;
						
						if (q>0 && ch<=q)
						{
							System.out.println("5");
							if (arr[i]%2==0)
							{
								System.out.println("6");
								arr[i]=0;
								q-=ch;
							}
							else
							{
								System.out.println("7");
								arr[i]=0;
								q-=ch;
								p-=1;
							}
						}
						else if(q>0 && ch>q)
						{
							
							System.out.println("8");
								arr[i]-=q;
								q=0;
							
								if (p>0 && arr[i]!=0 && arr[i]<=p)
								{
									System.out.println("9");
									arr[i]=0;
									p-=arr[i];
								}
							
							
						}
						else if (q==0 ){
							System.out.println("10");
							arr[i]=0;
							p-=arr[i];
						}
						ctr+=1;
					
			
					
		}
			out.printLine(ctr);
		out.flush();
	}
}
}

class InputReader {
	
	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
	private SpaceCharFilter filter;
	
	public InputReader(InputStream stream) {
		this.stream = stream;
	}
	
	public int read() {
		if (numChars == -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = stream.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}
	
	public int readInt() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}
	
	public String readString() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	}
	
	public boolean isSpaceChar(int c) {
		if (filter != null)
			return filter.isSpaceChar(c);
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}
	
	public String next() {
		return readString();
	}
	
	public interface SpaceCharFilter {
		public boolean isSpaceChar(int ch);
	}
}

class OutputWriter {
	private final PrintWriter writer;
	
	public OutputWriter(OutputStream outputStream) {
		writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
	}
	
	public OutputWriter(Writer writer) {
		this.writer = new PrintWriter(writer);
	}
	
	public void print(Object... objects) {
		for (int i = 0; i < objects.length; i++) {
			if (i != 0)
				writer.print(' ');
			writer.print(objects[i]);
		}
	}
	
	public void printLine(Object... objects) {
		print(objects);
		writer.println();
	}
	
	public void close() {
		writer.close();
	}
	
	public void flush() {
		writer.flush();
	}
	
}

class IOUtils {
	
	public static int[] readIntArray(InputReader in, int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = in.readInt();
		return array;
	}
	
}

