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
    int n = sc.nextInt ();	//size of the array
    int t = sc.nextInt ();	//traget value
    
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      {
	arr[i] = sc.nextInt ();
      }
    positionOfElement (arr, t,n);
    
    sc.close ();
  }
  public static void positionOfElement (int[]arr, int t, int n)
  {
      int first = -1;
    int last = -1;
    for (int i = 0; i < n; i++)
      {				//ith itration
	if (arr[i] == t)
	  {
	    if (first == -1)
	      {
		first = i;	//first occurance of t
	      }
	    last = i;		//last occurance of t
	  }
      }
      System.out.println (first + " " + last);
  }
}
