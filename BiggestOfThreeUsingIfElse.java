package javaindebuggingmode;

public class BiggestOfThreeUsingIfElse {

	static int biggestOfThree(int x,int y,int z)
	{
		if(x>=y && x>=z)
		{
			return x;
			
		}
		else if(y>=x && y>=z)
		{
			return y;
		}
		else
		{
			return z;
		}
		
	}
	public static void main(String[] args) {
		
		int a=5,b=10,c=3,largest;
		largest=biggestOfThree(a, b, c);
		System.out.println(largest+"is the largest Number.");
	}
}

