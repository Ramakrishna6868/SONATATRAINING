package javaindebuggingmode;

public class GFGSwapWithoutTemp {
	static void swapValuesWithoutUsingThirdVariable(int m,int n)
	{
		m=m-n;
		n=m+n;
		m=n-m;
		System.out.println("Value of m is\t"+m+"\nand \n Value of n is\t"+n);
	}
     
	public static void main(String[] args) {
		int m=9,n=5;
		swapValuesWithoutUsingThirdVariable(m, n);
	}
}
