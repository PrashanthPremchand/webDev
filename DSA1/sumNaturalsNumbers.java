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
                int n=sc.nextInt();
                System.out.println(sumNumbers(n));//calling the function sumnumber and passing the interger value
                sc.close();
	}
        public static int sumNumbers(int a)//creating a function with a return data type int
        {
                int sum=0;
                int i=1;
                while(i<=a)
                        {
                                sum+=i;
                                i++;
                        }
                return sum;   
	}
}
