/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
      System.out.println("Enter the heights of Gian and Suneo and their speed of magnification respectively as an integer less 10000 (Note: the height of Gian is always greater than Suneo)");
      int h1=sc.nextInt();
      int h2=sc.nextInt();
      int v1=sc.nextInt();
      int v2=sc.nextInt();
      if ((v2>v1)&&((h1+v1)>=(h2+v2)))
        System.out.println("true");
      else
        System.out.println("false");
      sc.close();

	}
}
