package DSA3.Stack.trappingRainWaterProblemUsingStack;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int n= sc.nextInt();
      	    int[] arr= new int[n];

      	    for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            
        
            Solution Obj = new Solution();
            Obj.TappingWater(arr, n);
            
        
        sc.close();
        
    }
}
class Solution
{
	//TC:O(N) SC:O(N)
    public void TappingWater(int []arr, int n)
    {
        //using momotonic Stack to code this in a single pass
        Stack<Integer> nextMax = new Stack<>();
        int lb = -1;
        int rb = -1;
        int waterArea = 0;
        for(int i =0; i < n; i++)
        {
            int ele = arr[i];
            while(nextMax.size() > 0 && ele >= arr[nextMax.peek()])
            {
                rb = arr[i];
                int height = arr[nextMax.pop()];
                if(nextMax.size() > 0)
                {
                    lb = arr[nextMax.peek()];
                    waterArea += (Math.min(lb, rb) - height) * (i - nextMax.peek() - 1);
                }
            }
            nextMax.push(i);
        }
        System.out.println(waterArea);
    }
}
