package javaindebuggingmode;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveRepeateElementsFromArrayListEx2 {

	public static void main(String args[])
	{
		ArrayList<String>
			gfg = new ArrayList<String>();

		gfg.add("Geeks");
		gfg.add("for");
		gfg.add("Geeks");

		System.out.println("Original ArrayList : "
						+ gfg);

		List<String> gfg1 = gfg.stream()
								.distinct()
								.collect(Collectors.toList());

		System.out.println("Modified List : " + gfg1);
	}
}

