package DSA3.Stack.stockSpanProblem;
import java.io.*;
import java.util.*;

class Pair{
    int val;
    int idx;
    Pair(int val, int idx){
        this.val = val;
        this.idx = idx;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        Solution s  = new Solution();
        int ans[] = s.stockSpan(a);
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}

class Solution {
    static int[] stockSpan(int[] a) {
        //moving right to left
        //stack will contain all the element for which next greater element from the left are needed
         int []ans = new int[a.length];
         Stack<Integer> st = new Stack<>();
         int curr = 0;
         for(int i = a.length - 1; i >= 0; i--)
         {
            curr = a[i];
            while(st.size() > 0 && curr > a[st.peek()])
            {
                //this will store the index of next greater element of st.peek()
				ans[st.peek()] = st.peek() - i;
                st.pop();
            }
            st.push(i);
         }  
		while(st.size() > 0){
            //this will store the remaining index of the element with no next greater element from the left left
				ans[st.peek()] = st.peek() + 1;
			    st.pop();
			}
         return ans;
    }
}
