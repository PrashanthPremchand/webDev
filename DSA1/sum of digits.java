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
		System.out.println("Enter an interger:");
		int num = sc.nextInt();
		int sum = 0;
		int r=0;
		while (num>0)
		{
		    r=num%10;
		    sum+=r;
		    num/=10;
		}
		System.out.println(" the sum of digits of the integer is:"+sum);
		sc.close();
	}
}
