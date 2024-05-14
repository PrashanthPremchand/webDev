/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Enter an year to findout if its a leap year!");
	    Scanner sc = new Scanner(System.in);
	    int y = sc.nextInt();
	    if (((y%100)==0)&&((y%400)==0))
	    {
	        System.out.println("This year is a leap year.");
	    }
	    else if (((y%4)==0)&&((y%100)!=0))
	    {
	       System.out.println("This year is a leap year."); 
	    }
	    else
	    {
	    System.out.println("This year is not a leap year.");    
	    }
}
}
