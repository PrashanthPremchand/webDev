package DSA3.Stack.sumOfSubArrayMinimumsUsingMomotonicStack;

import java.io.*;
import java.util.*;

class Solution{
	public long minSubarraySum(int n, int a[]){
		// write code here
		Stack<Integer> s = new Stack<>();
		long ans = 0;
		long mod = 1000000007;
		for(int i = 0; i < n; i++)
			{
				while(s.size() > 0 && a[s.peek()] > a[i]){
					int rb = i;
					int lb = -1;
					int idx = s.pop();
					if(s.size() > 0)lb = s.peek();
					long subAns = ((((rb - idx) * (idx - lb)) % mod) * a[idx]) % mod;
					ans = (ans + subAns) % mod;
				}
				s.push(i);
			}
		while(s.size() > 0)
			{
				int rb = n;
				int lb = -1;
				int idx = s.pop();
				if(s.size() > 0)lb = s.peek();
				long subAns = ((((rb - idx) * (idx - lb)) % mod) * a[idx]) % mod;
				ans = (ans + subAns) % mod;
			}
		return ans;
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
		Solution Obj = new Solution();
        System.out.println(Obj.minSubarraySum(n,a));
    }
}
