/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main {
  public static int multiplyRecursively(int n, int m) {
    //Write code here and print output
	  if(n==1)
	  return m;
	  return m+multiplyRecursively(n-1,m);
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    System.out.println(multiplyRecursively(n, m));
  }
}