/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int m = sc.nextInt ();	//number of rows
    int n = sc.nextInt ();	//number of columns
    int[][] mat = new int[m][n];	//declaring a 2D array
    for (int i = 0; i < m; i++)
      {
	for (int j = 0; j < n; j++)
	  {
	    mat[i][j] = sc.nextInt ();	//innitiziliting matrix
	  }
      }
    int[][] transMat = new int[n][m];
    for (int i = 0; i < m; i++)
      {
	for (int j = 0; j < n; j++)
	  {
	    transMat[j][i] = mat[i][j];	//transposing the matrix
	  }
      }
    int[][] rotMat = new int[n][m];
    for (int i = 0; i < n; i++)
      {
	int j = 0;
	int k = m - 1;
	while (j < m && k >= 0)
	  {
	    rotMat[i][j] = transMat[i][k];	//interchanging the row of the transpose matrix
	    System.out.print (rotMat[i][j] + " ");
	    j++;
	    k--;
	  }
	System.out.println ();
      }
    sc.close ();
  }
}
