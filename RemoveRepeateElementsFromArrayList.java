package javaindebuggingmode;

import java.util.*;

public class RemoveRepeateElementsFromArrayList {



	public static void main(String args[])
	{

		ArrayList<String>
			gfg = new ArrayList<String>();

		gfg.add("Geeks");
		gfg.add("for");
		gfg.add("Geeks");

		System.out.println("Original ArrayList : "
						+ gfg);

		System.out.println("\nUsing LinkedHashSet:\n");

		Set<String> set = new LinkedHashSet<>(gfg);

		List<String> gfg1 = new ArrayList<>(set);

		System.out.println("Modified ArrayList : "
						+ gfg1);

		System.out.println("\nUsing HashSet:\n");

		Set<String> set1 = new HashSet<>(gfg);

		List<String> gfg2 = new ArrayList<>(set);

		System.out.println("Modified ArrayList : "
						+ gfg2);
	}
}

