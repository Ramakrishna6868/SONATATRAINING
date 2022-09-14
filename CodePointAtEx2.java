package javaindebuggingmode;

public class CodePointAtEx2 {
	public static void main(String[] args)
	{
	StringBuffer str= new StringBuffer("GeeksForGeeks Contribute");

		try 
		{

			int i = str.codePointAt(24);
			System.out.println(i);
		}

		catch (IndexOutOfBoundsException e)
		{
			System.out.println("Exception: " + e);
		}
	}
}

