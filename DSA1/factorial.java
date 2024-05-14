/******************************************************************************


                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                System.out.println(factorial(n));
                sc.close();
	}
        public static int factorial(int n)
        {
                int f=1;
                int i=1;
                while(i<=n)
                        {
                                f*=i;
                                i++;
                        }
                return f;
	
}
