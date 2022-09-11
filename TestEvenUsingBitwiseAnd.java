package javaindebuggingmode;

public class TestEvenUsingBitwiseAnd {
	public static void main(String[] args) {
		
		int n=91;
		if((n&1)==1)
		{
			System.out.println("Number is Odd");
		}
		else
		{
			System.out.println("Number is Even");
		}
		
	}

}
