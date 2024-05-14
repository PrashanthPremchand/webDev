package altMatrixSum;

import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();	//number of row or column
    int[][] squ = new int[n][n];
    for (int i = 0; i< n; i++)
      {
	for (int j = 0; j < n; j++)
	  {
	    squ[i][j] = sc.nextInt ();
	  }
      }
    int whiteSum = 0;
    int blackSum = 0;
    for (int i = 0; i< n; i++)
      {//ith row
	for (int j = 0; j < n; j++)
	  {//jth column
	    if ((i + j )% 2 != 0)
	      {
		whiteSum += squ[i][j];//if the sum of i and j is odd then the square is white
	      }
	    else
	      {
		blackSum += squ[i][j];//if the sum of i and j is even then the square is black
	      }
	  }
      }
    System.out.println (blackSum);
    System.out.println (whiteSum);
    sc.close ();
  }
}

