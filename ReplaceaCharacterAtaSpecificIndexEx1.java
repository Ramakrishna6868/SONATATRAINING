package javaindebuggingmode;

public class ReplaceaCharacterAtaSpecificIndexEx1 {

	public static void main(String args[])
	{
		String str = "Geeks Gor Geeks";
		int index = 6;
		char ch = 'F';
		System.out.println("Original String = " + str);
		StringBuilder string = new StringBuilder(str);
		string.setCharAt(index, ch);
		System.out.println("Modified String = " + string);
	}
}

