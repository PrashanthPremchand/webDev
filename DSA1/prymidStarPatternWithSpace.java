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
	System.out.println("Enter the number of star lines:");
	int n=sc.nextInt();
	int i=1;
	while(i<=n)
	{
	 int j=1;
	 while(j<=n)
	 {
	     if(j<=n-i)
	     System.out.print(" ");
	     else
	     System.out.print("* ");
	     j++;
	 }
	 System.out.println();
	 i++;
	}
	}
}
