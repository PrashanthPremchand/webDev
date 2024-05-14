package Angle of a triangle;

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of three sides of a triangle as integers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	/*
		System.out.println("a="+ +a);
		System.out.println("b="+ +b);
		System.out.println("c="+ +c);
		*/
		
		if((a>b)&&(a>c))
		{
		    if((2*(a*a))<((a*a)+(b*b)+(c*c)))
		    {
		        System.out.println("1");
		    }
		    else if((2*(a*a))==((a*a)+(b*b)+(c*c)))
		    {
		        System.out.println("2");
		    }
		    else if((2*(a*a))>((a*a)+(b*b)+(c*c)))
		    {
		        System.out.println("3");
		    }
		}
		else if((b>a)&&(b>c))
		{
		    if((2*(b*b))<((a*a)+(b*b)+(c*c)))
		    {
		        System.out.println("1");
		    }
		    else if((2*(b*b))==((a*a)+(b*b)+(c*c)))
		    {
		        System.out.println("2");
		    }
		    else if((2*(b*b))>((a*a)+(b*b)+(c*c)))
		    {
		        System.out.println("3");
		    }
		}
			else 
		{
		    if((2*(c*c))<((a*a)+(b*b)+(c*c)))
		    {
		        System.out.println("1");
		    }
		    else if((2*(c*c))==((a*a)+(b*b)+(c*c)))
		   {
		        System.out.println("2");
		    }
		    else if((2*(c*c))>((a*a)+(b*b)+(c*c)))
		    {
		        System.out.println("3");
		    }
		}
		sc.close();
	}
}
