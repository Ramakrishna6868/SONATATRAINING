package javatraining;

public class TestEvenOddUsingXOR 
{
	public static void main(String[] args) 
	{
		int num=99;
		if((num^1)==num+1)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
		
	}

}
