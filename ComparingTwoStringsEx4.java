package javaindebuggingmode;

import java.util.*;

public class ComparingTwoStringsEx4 {
	public static void main(String args[])
	{
		String string1 = new String("Geeksforgeeks");
		String string2 = new String("Geeks");
		String string3 = new String("Geeks");
		String string4 = null;
		String string5 = null;
		System.out.println("Comparing " + string1 + " and " + string2
						+ " : " + Objects.equals(string1, string2));
		System.out.println("Comparing " + string2 + " and " + string3
						+ " : " + Objects.equals(string2, string3));
		System.out.println("Comparing " + string1 + " and " + string4
						+ " : " + Objects.equals(string1, string4));
		System.out.println("Comparing " + string4 + " and " + string5
						+ " : " + Objects.equals(string4, string5));
	}
}

