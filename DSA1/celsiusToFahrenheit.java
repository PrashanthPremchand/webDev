/******************************************************************************


                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc=new Scanner(System.in);
                int c=sc.nextInt();
                System.out.println(celsiusFahrenheit(c));
                sc.close();
	}
        public static float celsiusFahrenheit(int c)
        {
                float f=(c*1.8f)+32f;
                return f;
        }  
	
}
