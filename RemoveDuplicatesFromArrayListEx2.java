package javaindebuggingmode;

import java.util.*;
public class RemoveDuplicatesFromArrayListEx2 {

	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
	{
		Set<T> set = new LinkedHashSet<>();

		set.addAll(list);

		list.clear();

		list.addAll(set);

		return list;
	}

	public static void main(String args[])
	{
		ArrayList<Integer>
			list = new ArrayList<>(
				Arrays
					.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));

		System.out.println("ArrayList with duplicates: "
						+ list);

		ArrayList<Integer>
			newList = removeDuplicates(list);

		System.out.println("ArrayList with duplicates removed: "
						+ newList);
	}
}

