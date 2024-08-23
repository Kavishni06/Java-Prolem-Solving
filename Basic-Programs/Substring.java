package DAY4;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Substring {
	class GFG
	{
	    public static void main(String[] args) throws IOException
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int T = Integer.parseInt(br.readLine().trim());
	        while(T-->0)
	        {
	            String str = br.readLine().trim();
	            Solution ob = new Solution();
	            int ans = ob.LongestRepeatingSubsequence(str);
	            System.out.println(ans);
	        }
	    }
	}
	class Solution
	{
	    public int LongestRepeatingSubsequence(String str)
	    {
	        int len = str.length();
	    String text = str;
	    int[][] dp = new int[len+1][len+1];
	    for (int i = 1; i <= len; i++) {
	        for (int j = 1; j <= len; j++) {
	            if (str.charAt(i-1) == text.charAt(j-1) && i != j) {
	                dp[i][j] = 1 + dp[i-1][j-1];
	            } else {
	                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
	            }
	        }
	    }
	    return dp[len][len];
	    }
	    }
}
