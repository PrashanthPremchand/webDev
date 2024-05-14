/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int r = sc.nextInt ();
      nCr (n, r);
      sc.close ();
  }
  public static void nCr (int n, int r)
  {
    long den = 1l;
    long num = 1l;
    int i = 1;
    int j = n;
    while (i <= n)
      {
	if (j >= r + 1)
	  {
	    num *= j;
	  }
	if (i <= (n - r))
	  {
	    den *= i;
	  }
	  j--;
	  i++;
      }
    System.out.println (num / den);
  }
}
