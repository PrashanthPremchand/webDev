/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static ArrayList<String> subString(String s)
    {
        if(s.length() == 0)
        {
            ArrayList<String> r = new ArrayList<>();
            r.add("");
            return r;
        }
       char fc = s.charAt(0);
       String ss = s.substring(1);
       ArrayList <String> alss = subString(ss);
       ArrayList <String> ans = new ArrayList<>();
       for(int i = 0; i < alss.size(); i++)
       {
           ans.add(alss.get(i));
       }
       for(int i = 0; i < alss.size(); i++)
       {
           ans.add(fc + alss.get(i));
       }
       return ans;
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		System.out.println(subString(s));
	}
}
