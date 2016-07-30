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
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
class Club
{
	ArrayList<Team> teams;
	Club(ArrayList<Team> t)
	{
		teams=t;
	}
	void printClub()
	{
		for(int i=0;i<teams.size();i++)
			System.out.println(teams.get(i).name);	
	}
	void sort()
	{
		Collections.sort(teams);
		Collections.reverse(teams);
	}
	
}
class Team implements Comparable<Team>
{
	String name;
	int mp;
	int gf;
	int ga;
	int mw;
	int gd;
	int md;
	int points;
	
	public int compareTo(Team b)
	{
		if (this.points==b.points)
		{
			if(this.gd==b.gd)
			{
				if(this.gf==b.gf)
				{
					if (this.name.compareTo(b.name)>0)
						return -1;
					else if (this.name.compareTo(b.name)<0)
						return 1;
					else
						return 0;
				}
				else if(this.gf>b.gf)
					return 1;
				else
					return -1;
			}
			else if (this.gd>b.gd)
				return 1;
			else
				return -1;
		}
		else if (this.points>b.points)
			return 1;
		else
			return -1;
	}
	
	Team(String name,int mp,int gf,int ga)
	{
		this.name=name;
		this.mp=mp;
		this.gf=gf;
		this.ga=ga;
		
		updateGD();
	}
	void points()
	{
		points=2*mw+1*md;
	}

	void updateGD()
	{
		gd=Math.abs(gf-ga);
		
	}
	void addGF(int ng)
	{
		gf+=ng;
		updateGD();
	}
	void addGA(int ng)
	{
		ga+=ng;
		updateGD();
	}
	void mwon()
	{
		mw+=1;
	}
	
}

public class Main
{
	public static void main(String[] args)
	{
		HashMap<String,Team> hm = new HashMap<String,Team>();
		HashMap<String,Integer> pl = new HashMap<String,Integer>();
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		int n=in.readInt();
		String na[]=new String[n];
		for(int i=0;i<n;i++)
			na[i]=in.readString();
		
		
		
		ArrayList<Team> te=new ArrayList<Team>();
		for(int temp=0;temp<n;temp++){
			Team tmp=new Team(na[temp],0,0,0);
			te.add(tmp);
			hm.put(na[temp],tmp);
			
		}		
		
		int mat=in.readInt();
		boolean flag=true;
		for(int temp=0;temp<mat;temp++)
		{
			String nam=in.readString();
			String nam2=in.readString();
			String key1=nam+nam2;
			String key2=nam2+nam;
			
			pl.get(key2);
			if (nam.equals(nam2)){
				System.out.println("Invalid Input");
				flag=false;
				break;
			}
			if (!pl.containsKey(key1)){
				//System.out.println("here");
				pl.put(key1, 0);
				pl.put(key2, 0);}
			//System.out.println(pl.get(key1));
			if (pl.get(key1)>1 || pl.get(key2)>1){
				System.out.println("Invalid Input");
			flag=false;
			break;
			}
			pl.put(nam+nam2, pl.get(nam+nam2)+1);
			pl.put(nam2+nam, pl.get(nam2+nam)+1);
			
			int x1=in.readInt();
			int x2=in.readInt();
			hm.get(nam).mp+=1;
			hm.get(nam).addGA(x2);
			hm.get(nam).addGF(x1);
			hm.get(nam2).mp+=1;
			hm.get(nam2).addGA(x1);
			hm.get(nam2).addGF(x2);
			if (x1>x2)
				hm.get(nam).mw+=1;
			else if (x1<x2)
				hm.get(nam2).mw+=1;
			else{
				hm.get(nam).md+=1;
				hm.get(nam2).md+=1;}
			
			
				
		}
		if (flag){
			for(Team teams:te)
				teams.points();
			Club club=new Club(te);
			
			club.sort();
			club.printClub();}
		
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
