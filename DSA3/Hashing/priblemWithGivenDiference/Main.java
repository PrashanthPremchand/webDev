package DSA3.Hashing.priblemWithGivenDiference;

import java.io.*;
import java.util.*;

class Solution {
    public int givenDifference(int []A, int n, int B) {
		//using hashset to store the values looking for pair
		//n-B and n+B are possible pairs for n whose difference is B 
		//n-B _______n________n+B
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < n; i++){
			int p1 = A[i] - B;//first pair
			int p2 = A[i] + B;//second pair
		   if(set.contains(p1) || set.contains(p2))return 1;
			else set.add(A[i]);
		}
		return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,B;
        n = sc.nextInt();
        int []mat=new int[n];
        for(int i=0;i<n;++i){
            mat[i]=sc.nextInt();
        }
        B = sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.givenDifference(mat,n,B));
        System.out.println('\n');
    }
}

