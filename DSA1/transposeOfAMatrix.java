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
    int n = sc.nextInt ();
    int[][] mat = new int[n][n];
    for (int i = 0; i < n; i++)
      {
	for (int j = 0; j < n; j++)
	  {
	    mat[i][j] = sc.nextInt ();
	  }
      }
    int[][] transMat = new int[n][n];
    for (int i = 0; i < n; i++)
      {
	for (int j = 0; j < n; j++)
	  {
	    transMat[i][j] = mat[j][i];
	    System.out.print (transMat[i][j] + " ");
	  }
	System.out.println ();
      }
    sc.close ();
  }
}
