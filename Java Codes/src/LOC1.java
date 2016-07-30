/*
 *  @author Amit
 */

import java.util.Arrays;


class LOC1
{
	public static void main(String[] args)
	{
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		
		out.flush();
	}
	public static int[] getLIS(int[] x) {
	    int n = x.length;
	    int[] len = new int[n];
	    Arrays.fill(len, 1);
	    int[] pred = new int[n];
	    Arrays.fill(pred, -1);
	    for (int i = 1; i < n; i++) {
	      for (int j = 0; j < i; j++) {
	        if (x[j] < x[i] && len[i] < len[j] + 1) {
	          len[i] = len[j] + 1;
	          pred[i] = j;
	        }
	      }
	    }
	    int bi = 0;
	    for (int i = 1; i < n; i++) {
	      if (len[bi] < len[i]) {
	        bi = i;
	      }
	    }
	    int cnt = len[bi];
	    int[] res = new int[cnt];
	    for (int i = bi; i != -1; i = pred[i]) {
	      res[--cnt] = x[i];
	    }
	    return res;
	  }
}
