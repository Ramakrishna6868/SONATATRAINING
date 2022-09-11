package javatraining;

public class TestEvenOddBycheckingLSB 
{
	public static String TestEvenOddBycheckingLSB(int a) 
	{
		if(a!=0)
		{
			if(Integer.toBinaryString(a).endsWith("0"))
			{
				return "Even";
			}
			else
			{
			    return "Odd";	
			}
		}
		else
		{
		    return "Zero";	
		}
		
	}
	public static void main(String[] args)
	{
	    for(int i=0;i<=10;i++)
	    {
	    	System.out.println(i+":"+TestEvenOddBycheckingLSB(i));
	    }
	}

}
