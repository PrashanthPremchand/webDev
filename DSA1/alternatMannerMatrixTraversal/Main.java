package alternatMannerMatrixTraversal;

import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int m = sc.nextInt ();//number of rows 
    int n = sc.nextInt ();//number of columns 
    int[][] mat = new int[m][n];//declaring the 2d matrix 
    for (int i = 0; i < m; i++)
      {
	for (int j = 0; j < n; j++)
	  {
	    mat[i][j] = sc.nextInt ();//intilizating the 2d matrix
	  }
      }

    for (int i = 0; i < m; i++)
      {//ith row 

	if (i % 2 != 0) //checking if the ith row is odd or even
	  {
	    int j = n - 1;
	    while (j >= 0)
	      {
		System.out.print (mat[i][j] + " ");//if odd print this 
		j--;
	      }
	  }
	else
	  {
	    int j = 0;
	    while (j < n)
	      {
		System.out.print (mat[i][j] + " ");//if even print this
		j++;
	      }
	  }

      }

    sc.close ();
  }
}
