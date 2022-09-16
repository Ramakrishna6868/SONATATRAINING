package javaindebuggingmode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListEx9 {
	public static void main(String args[])
	{
		List<Integer> list1 = Stream.of(1, 2, 3)
								.collect(Collectors.toList());

		System.out.println("List using Syntax 1: "
						+ list1.toString());

		List<Integer> list2 = Stream
								.of(3, 2, 1)
								.collect(
									Collectors
										.toCollection(ArrayList::new));

	System.out.println("List using Syntax 2: "
						+ list2.toString());
		List<Integer> list3 = Stream
								.of(1, 2, 3, 4)
								.collect(
									Collectors
										.collectingAndThen(
											Collectors.toList(),
											Collections::unmodifiableList));
		System.out.println("List using Syntax 3: "
						+ list3.toString());
	}
}
