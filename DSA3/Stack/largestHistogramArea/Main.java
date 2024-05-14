package DSA3.Stack.largestHistogramArea;
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[(int)n];
        for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
        System.out.println(new Solution().maximumArea(arr, n));
	}
}

class Solution
{
      public static long maximumArea(long hist[], long n){
	//Your code here 
        long []lvl = lestValueLeft(hist, n);
        long []lvr = lestValueRight(hist, n);
        long []area = new long[(int)n];
        long maxArea = 0;
        for(int i = 0 ;i < n; i++)
        {
            area[i] = (lvr[i] - lvl[i] -1) * hist[i];
            if(area[i] > maxArea)maxArea = area[i];
        }
        return maxArea;
    }
    public static long[] lestValueLeft(long []arr, long n)
    {
        //to creat an array of next small element in left for the histogram array
        //moving right to left
        Stack<Integer> st = new Stack<>();
        long []ans = new long[(int)n];
        for(int i = (int)n - 1; i >= 0; i--)
        {
            long ele = arr[i];
            while(st.size() > 0 && arr[st.peek()] > ele)
            {
                ans[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while(st.size() > 0)
        {
            ans[st.peek()] = -1;
            st.pop();
        }
        return ans;
    }
    public static long[] lestValueRight(long[] arr, long n)
    {
        //to creat an array of next small element in the right for thr histogram array
        // moving left to rigth
        Stack<Integer> st = new Stack<>();
        long []ans = new long[(int)n];
        for(int i = 0; i < n; i ++){
            long ele = arr[i];
            while(st.size() > 0 && arr[st.peek()] > ele)
            {
                ans[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while(st.size() > 0)
        {
            ans[st.peek()] = n;
            st.pop();
        }
        return ans;
    }
}



