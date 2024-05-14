package DSA3.Stack.nextGreaterElementRight;
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        //Write code here and print output
        //TC:O(n2) 
        long []ans = new long[n];
        int i = 0;
        int j = 1;
        while(i < n)
        {
            
            j = (i < n - 1) ? (i + 1) : (n - 1);
            if(arr[i] < arr[j])ans[i] = arr[j];
            else
            {
                while(arr[i] >= arr[j])
                {
                    if(j == n - 1)
                    {
                        ans[i] = -1;
                        break;
                    }
                    j++;
                ans[i] = arr[j];
                }
            }
            i++;
        }
        return ans;
    } 
}
class Main {
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
	}
}