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
      lastIndex (s);
      sc.close ();
  }
  public static void lastIndex (String s)
  {
    int j = 0;
    int i = 0;
    int index = -1;
    while (i < s.length ())
      {
	j = s.indexOf ("1", i);
	if (j == -1)
	  {
	    break;
	  }
	index = j;
	i++;
      }
    System.out.println (index);
  }
}
