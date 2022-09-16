package javaindebuggingmode;

import java.util.*;
public class ListEx6 {
public static void main(String args[])
	{
		List<Integer> list = Collections.unmodifiableList(
			Arrays.asList(1, 2, 3));
		System.out.println("List : " + list.toString());
	}
}

