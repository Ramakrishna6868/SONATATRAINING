package javaindebuggingmode;

import java.util.*;
public class ListEx5 {
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 1, 2, 3, 4);

		System.out.println("List : " + list.toString());
	}
}

