import java.io.*;
import java.util.*; 

class Main{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M[][] = new int[N][N];
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                M[i][j] = sc.nextInt();
        System.out.println(new Solution().findCelebrity(M,N));
    } 
} 
class Solution
{ 
    int findCelebrity(int M[][], int n)
    {
		//celeberites are known by everyone but knows no one
		//condisering everone as potential celebs 
       Stack<Integer> potentialCelbs = new Stack<>();
		for(int i = 0; i < n; i++)
			{
				potentialCelbs.push(i);
			}
		while(potentialCelbs.size() > 1)//until one is left
			{
				int pc1 = potentialCelbs.pop();
				int pc2 = potentialCelbs.pop();
				if(M[pc1][pc2] == 1)potentialCelbs.push(pc2);//pc1 is not a potential celeb
				else potentialCelbs.push(pc1);//pc2 is not a potential celeb
			}
				int pc = potentialCelbs.pop();
		for(int i = 0; i < n; i++)
			{
				if(M[pc][i] == 1)return -1;
				if(pc != i)
				{
					if(M[i][pc] == 0)return -1;
				}
			}
		return pc;
    }

}