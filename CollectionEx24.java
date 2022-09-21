package javaindebuggingmode;

import java.util.*;
import java.util.stream.*;

public class CollectionEx24 {

	public static <T> Set<T> convertListToSet(List<T> list)
	{
		HashSet<T> set = new HashSet<>();
		set.addAll(list);
		return set;
	}

	public static void main(String args[])
	{

		List<String> list = Arrays.asList(
			"GeeksForGeeks", "Geeks", "forGeeks",
			"A computer portal", "for", "Geeks");

		System.out.println("List: " + list);

		Set<String> set = convertListToSet(list);

		System.out.println("Set from List: " + set);
	}
}

