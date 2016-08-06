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

class Main 
{
	public static void main(String[] args)
	{
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		
		int tc = in.readInt();
		for (int test = 0; test < tc; test++) {
		
		int n=in.readInt();
		int[] c=IOUtils.readIntArray(in, n);
		int ans=0;
		int[] cb=new int[n];
		Arrays.fill(cb, 0);
		
		for(int i=0;i<n;i++)
		{	
			/*for (int cbb : cb) {
				System.out.print(" "+cbb);
			}
			//System.out.println(" "+i);
			*/if (cb[i] !=0)
				continue;
			
			int[] cr=new int[n];
			cb[i]=i+1;
			
			
			int k=(c[i]+i+1) % n;
			
			
			int ctr=0;
			
			int kr=0;
			while(kr++<=n)
			{
				
				if (cb[k]==(i+1))
				{
					//System.out.println("#1"+ctr);
					ans+=(1+ctr-cr[k]);
					break;
				}
				else if(cb[k]!=0){
					//System.out.println("#2");
					break;
					
				}
				cr[k]=++ctr;
				//System.out.println("#3");
				cb[k]=i+1;
				k=(k+c[k]+1) % n;
				
				
				
				
			}
			
		}
		out.printLine(ans);
		
	}
		out.flush();
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

