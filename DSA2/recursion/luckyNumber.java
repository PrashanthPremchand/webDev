/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());
        Solution ob = new Solution();
        System.out.println(ob.solve(n));

    }
}

class Solution {

    static int solve(int n) {
        // code here
		int i = sumSquare(++n);
		if(i == 1)return n;
		else
		{
			return solve(n);
		}
    }
	static int sumSquare(int n)
	{
		if(n == 16)return 0;
		if(n == 89)return 0;
		if(n == 1)return 1;
		int a = n;
		int s = 0;
		while(a > 0)
		{
			s += ((a % 10) * (a % 10)); 
			a /= 10;
		}
		if (s == 1)return 1;
		else
		{
			return sumSquare(s);
		}
	}
}