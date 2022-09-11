package javaindebuggingmode;

public class TestEvenOddUsingBitwiseOR 
{
	public static void main(String[] args)
	{
		int n=100;
		if((n|1)>n)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
		
	}

}
