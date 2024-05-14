/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
Import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int k = sc.nextInt ();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      {
	arr[i] = sc.nextInt ();
      }
    sort (arr, k);
    System.out.print (arr[n - k]);
  }
  public static void sort (int[]arr, int k)
  {
    int n = arr.length;
    for (int i = 0; i < k; i++)
      {
	for (int j = 0; j < n - 1 - i; j++)
	  {
	    if (arr[j] > arr[j + 1])
	      {
		int temp = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = temp;
	      }
	  }
      }
  }
}
