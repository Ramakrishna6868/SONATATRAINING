package javaindebuggingmode;

import java.util.*;
public class FindSublistEx2 {

	public static void main(String[] argv) throws Exception
	{
		try {

			ArrayList<String> arrlist = new ArrayList<String>();

			arrlist.add("Example");
			arrlist.add("in");
			arrlist.add("Geeks");
			arrlist.add("for");
			arrlist.add("Geeks");

			System.out.println("Original arrlist: "
							+ arrlist);

			List<String> arrlist2 = arrlist.subList(2, 5);

			System.out.println("Sublist of arrlist: "
							+ arrlist2);
			}

		catch (IndexOutOfBoundsException e)
		{
			System.out.println("Exception thrown : " + e);
		}

		catch (IllegalArgumentException e)
		{
			System.out.println("Exception thrown : " + e);
		}
	}
}

