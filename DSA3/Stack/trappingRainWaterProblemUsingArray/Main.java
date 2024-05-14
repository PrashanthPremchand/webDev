package DSA3.Stack.trappingRainWaterProblemUsingArray;
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
    public static void TappingWater(int []arr, int n)
    {
        //step 1: first pass creat an array to store left max data
        int []lmax = new int[n];
        int lb = -1;
        for(int i = 0; i < n; i++)
        {
            if(lb > arr[i])
            {
                lmax[i] = lb;
            }
            else
            {
                lmax[i] = -1;
                lb = arr[i];
            }
        }
        //step 2: second pass creat an array to store right max data
        int []rmax = new int[n];
        int rb = -1;
        for(int i = n - 1; i >= 0; i--)
        {
            if(rb > arr[i])rmax[i] = rb;
            else{
                rmax[i] = -1;
                rb = arr[i];
            }
        }
        //third pass creat an array to store the height of water at individual locations
        //         - -
        //         - -
        //         - -
        //         ____
        //         |  |
        int waterArea = 0;
        int heightOfWater = 0;
        for(int i = 0; i < n;i++)
        {
            if(lmax[i] != -1 && rmax[i] != -1)
            {
                heightOfWater = Math.min(lmax[i], rmax[i]) - arr[i];
                waterArea += heightOfWater * 1;//the breath is 1
            }
        }
        System.out.println(waterArea);
    }
}
