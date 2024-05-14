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
    String s = sc.next ();
    int[] indices = new int[n];
    for (int i = 0; i < n; i++)
      {
	indices[i] = sc.nextInt ();
      }
    char[] arr = new char[n];
    for (int i = 0; i < n; i++)
      {
	arr[indices [i]] = s.charAt (i);
      }
    String shuffledString = "";
    for (int i = 0; i < n; i++)
      {
	shuffledString += arr[i];
      }
    System.out.println (shuffledString);
    sc.close ();
  }
}
