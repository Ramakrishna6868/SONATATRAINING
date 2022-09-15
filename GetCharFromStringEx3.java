package javaindebuggingmode;

public class GetCharFromStringEx3 {


	public static char
	getCharFromString(String str, int index)
	{
		return (char)str.codePointAt(index);
	}
	public static void main(String[] args)
	{
		String str = "GeeksForGeeks";
		int index = 5;
		char ch = getCharFromString(str, index);
		System.out.println("Character from " + str
						+ " at index " + index
						+ " is " + ch);
	}
}


