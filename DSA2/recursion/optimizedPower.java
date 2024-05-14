/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
       int X,N;
        X = sc.nextInt();        
        N = sc.nextInt();
        System.out.println(power(X,N));
		sc.close();
    }

	public static long power(int x, int n)
    {
		//Write code here
		long op = xPowerN(x, n / 2);
		if(n % 2 == 0)return op * op;
		else return x * op * op;
    }
    
	public static long xPowerN(int x, int n)
	{
		if(n == 0)return 1;
		return x * xPowerN(x, n - 1);
	}
}