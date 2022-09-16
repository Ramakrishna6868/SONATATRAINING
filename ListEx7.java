package javaindebuggingmode;

import java.util.*;

public class ListEx7 {

	public static void main(String args[])
	{

		try {
			List<Integer> list = Collections.unmodifiableList(
				Arrays.asList(1, 2, 3));
			System.out.println("List : " + list.toString());
			System.out.println("Trying to modify the list");
			list.set(0, list.get(0));
     		}
		catch (Exception e) {
			System.out.println("Exception : " + e);
		}
	}
}

