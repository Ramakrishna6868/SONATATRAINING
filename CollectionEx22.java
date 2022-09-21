package javaindebuggingmode;
import java.util.*;
public class CollectionEx22 {

	public static <T> List<T>
	getListFromIterator(Iterator<T> iterator)
	{

		List<T> list = new ArrayList<>();

		iterator.forEachRemaining(list::add);

		return list;
	}

	public static void main(String[] args)
	{

		Iterator<Integer>
			iterator = Arrays.asList(1, 2, 3, 4, 5)
						.iterator();

		List<Integer>
			list = getListFromIterator(iterator);

		System.out.println(list);
	}
}
