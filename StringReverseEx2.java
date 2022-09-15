package javaindebuggingmode;

import java.lang.*;
import java.io.*;
import java.util.*;

public class StringReverseEx2 {

	public static void main(String[] args)
	{
		String input = "GeeksForGeeks";
		char[] try1 = input.toCharArray();
		for (int i = try1.length - 1; i >= 0; i--)
			System.out.print(try1[i]);
	}
}
