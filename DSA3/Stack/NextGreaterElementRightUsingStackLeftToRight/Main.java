package DSA3.Stack.NextGreaterElementRightUsingStackLeftToRight;
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static long[] nextLargerElement(long[] arr, int n)
    { 
		//TC:
		//the stack will have elements looking for the next greater element 
        long []ans = new long[arr.length];
        int idx = 0;//storing element in the stack will be dificult to retrive the respective element from the array, so we are storing the index of the array in the stack 
        Stack<Integer> st = new Stack<>();
        //moving from left to right looking for next greater element right
        for(int i = 0; i < arr.length; i ++)
        {
            long ele = arr[i];
            while(st.size() > 0 && ele > arr[st.peek()])
            {
                idx = st.peek();
                st.pop();
                arr[idx] = ele;
            }
            st.push(i);
        }
        //the remaning element still looking for the next greater element on the right will be set to -1
        while(st.size() > 0)
        {
            ans[st.peek()] = -1;
            st.pop();
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