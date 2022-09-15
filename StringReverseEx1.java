package javaindebuggingmode;

import java.lang.*;
import java.io.*;
import java.util.*;


public class StringReverseEx1 {

	public static void main(String[] args)
	{
		String str = "Geeks";
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println(sbr);
	}
}

