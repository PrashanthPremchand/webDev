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
    String s = sc.next ();
    int m = s.length ();
    int n = ((m - 2) * 2) + 2;	//since 'h' and 'y' are always the start and the end, we are calculating the number of the new string
    char[] arr = new char[n];
      arr[0] = 'h';		//first character is 'h'
      arr[n - 1] = 'y';		//last character is 'y'
    for (int i = 1; i < n - 1; i++)
      {
	arr[i] = 'e';		//all the middle character are 'e'
      }
    for (int i = 0; i < n; i++)
      {
	System.out.print (arr[i]);
      }
    sc.close ();
  }
}
