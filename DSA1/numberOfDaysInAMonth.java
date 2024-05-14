/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Enter any months number between 1 to 12, I will give you the number of days in it.");
		Scanner sc = new Scanner(System.in);
      int m=sc.nextInt();
      if (m==1)
        System.out.println(31);
      else if (m==2)
        System.out.println(28);
      else if (m==3)
        System.out.println(31);
      else if (m==4)
        System.out.println(30);
      else if (m==5)
        System.out.println(31);
      else if (m==6)
        System.out.println(30);
      else if (m==7)
        System.out.println(31);
      else if (m==8)
        System.out.println(31);
      else if (m==9)
        System.out.println(30);
      else if (m==10)
        System.out.println(31);
      else if (m==11)
        System.out.println(30);
      else if (m==12)
        System.out.println(31);
      else 
      System.out.println("Enter a valied interger between 1 and 12.");
        
      sc.close();
	}
}
