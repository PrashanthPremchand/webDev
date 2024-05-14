package DSA3.Stack.nextGreaterElementRightUsingStackRightToLeft;
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static long[] nextLargerElement(long[] arr, int n)
    { 
		//TC:O(n) SC:O(n)
		//the stack will have all the next potential greater element o the right
        //using stacks to store the next potential greater element moving right to left
		
		long []ans = new long[arr.length];
		Stack<Long> st = new Stack<>();
		for(int i = arr.length - 1; i >= 0; i--)
		{
			long ele = arr[i];
			while(st.size() > 0 && st.peek() <= ele)
			{
				st.pop();
			}
			if(st.size() != 0)ans[i] = st.peek();
			else ans[i] = -1;
			st.push(ele);
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