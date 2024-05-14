/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) 
	{
		Pizza dp = new DeluxePizza(false);
		dp.addExtraTopping();
		dp.addExtraCheese();
		System.out.print(dp.getBill());
	}
}
