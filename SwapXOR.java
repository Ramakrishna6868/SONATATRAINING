package javatraining;

public class SwapXOR {
	static void swapValuesUsingXOROperator(int m,int n)
	{
		m=m^n;
		n=m^n;
		m=m^n;
		System.out.println("Value of m is\t"+m+"\nand \nvalue of n is\t"+n);
	}
	public static void main(String[] args) {
		int m=9,n=5;
		swapValuesUsingXOROperator(m,n);
	}

}
