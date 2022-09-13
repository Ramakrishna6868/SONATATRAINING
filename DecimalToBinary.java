package javaindebuggingmode;


class xyz
{
public void decToBinary(int n)
{
        for (int i = 31; i >= 0; i--) 
        {
        int k = n >> i;
        if ((k & 1) > 0)
            System.out.print("1");
        else
            System.out.print("0");
         }
}
}

public class DecimalToBinary {
	public static void main(String[] args)
	{
	    xyz g = new xyz();
	    int n = 32;
	      System.out.println("Decimal - " + n);
	     System.out.print("Binary - ");
	    g.decToBinary(n);
	}

}
