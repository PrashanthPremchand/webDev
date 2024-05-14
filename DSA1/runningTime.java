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
    int n = sc.nextInt ();//size of the array 
    int[] a = new int[n];//array intialization 
    for (int i = 0; i < n; i++)
      {
	    a[i] = sc.nextInt ();//array declaration
      }
    int shifts = insertionSort (a);//calling the function and catching the return value
    System.out.println (shifts);
    sc.close ();
  }
  public static int insertionSort (int[]a)
  {
    int n = a.length;
    int shifts = 0;
    for (int i = 1; i < n; i++)//loop for n-1 iteration
      {
	    for (int j = i - 1; j >= 0; j--)//loop to sort all the values befor ith index
	    {
	     if (a[j] > a[j+1])
	      {
	    	int t = a[j];
		    a[j] = a[j+1];
		    a[j+1] = t;
		    shifts++;
	      }
	    else
	      {
		break;
	      }
	    }
      }
    return shifts;
  }
}
