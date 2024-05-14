package DSA3.Stack.minimumStack;

import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			Solution g = new Solution();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
        sc.close();
		
	}
}

class Solution
{
	int minEle;
	Stack<Integer> s;
    
	Solution()
	{
		s = new Stack<Integer>();
	}

	void push(int x){
        //Write Code here
		//creating an star value for the minimum element
		if(s.size() ==0){
			minEle = x;
			s.push(x);
		}else if(x < minEle){
			int prevMin = x - minEle;
			minEle = x;
			s.push(prevMin);
		}else {
			s.push(x);
		}
    }
	
	int pop(){
        //Write Code here
		if(s.size() == 0)return -1;
		else if(s.peek() < minEle){
			//this is a star value
			int prevMin = minEle - s.pop();
			int temp = minEle;
			minEle = prevMin;
			return temp;
		}else return s.pop();
	}

    int getMin(){
        //Write Code here
		if(s.size() == 0)return -1;
		return minEle;
	}	
}

