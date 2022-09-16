package javaindebuggingmode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SplitListInto2EqualHalfsEx3 {


	public static List[] split(List<String> list)
	{

		int midIndex
			= ((list.size() / 2)
			- (((list.size() % 2) > 0) ? 0 : 1));

		List<List<String> > lists = new ArrayList<>(
			list.stream()
				.collect(Collectors.partitioningBy(
					s -> list.indexOf(s) > midIndex))
				.values());

		return new List[] { lists.get(0), lists.get(1) };
	}

	public static void main(String[] args)
	{

		List<String> list = new ArrayList<String>();

		list.add("Geeks");
		list.add("Practice");
		list.add("Contribute");
		list.add("IDE");
		list.add("Courses");

		List[] lists = split(list);

		System.out.println(lists[0]);
		System.out.println(lists[1]);
	}
}

