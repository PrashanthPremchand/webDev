/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
//OOP creating a class or Object
		class Student
		{
		    String name;
		    int roll_number;
		    char section;
		}
public class Main
{
    
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the details of the first student");
	    Student s1 = new Student();
	    System.out.print("Name: ");
	    s1.name=sc.nextLine();
	    System.out.print("Roll Number: ");
	    s1.roll_number=sc.nextInt();
	    System.out.print("Section: ");
	    s1.section=sc.next().charAt(0);
	    System.out.println("the details of the first student is:");
	    System.out.println("Name: "+s1.name);
	    System.out.println("Roll Number: "+s1.roll_number);
	    System.out.println("Section: "+s1.section);
	    sc.close();
	}
}
