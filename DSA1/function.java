/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Enter an interger and its power,");
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int p = sc.nextInt();
	    System.out.println("Answer from function power:"+power(a,p));
	    powervoid(a,p);
	    sc.close();
	    
}


public static int power(int a, int p)
{
    int b=a;
    for(int i=1; i<p; i++)
    {

        a=a*b;
    }
    return a;
}

public static void powervoid(int a, int p)
{
    int b=a;
    for(int i=1; i<p; i++)
    {

        a=a*b;
    }
    System.out.println("Answer for the function powervoid:"+a);
}
}
