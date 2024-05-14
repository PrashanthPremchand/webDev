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
    int t = sc.nextInt ();
    for (int j = 0; j < t; j++)
      {
	int n = sc.nextInt ();
	int[] arr = new int[n];
	for (int i = 0; i < n; i++)
	  {
	    arr[i] = sc.nextInt ();
	  }
	boolean flag = true;
	for (int i = 0; i < n - 1; i++)
	  {
	    if (arr[i] >= arr[i + 1])
	      {
		flag = false;
		break;
	      }
	  }
	if (flag == true)
	  {
	    System.out.println ("YES");
	  }
	else
	  {
	    System.out.println ("NO");
	  }
      }
    sc.close ();

  }
}
