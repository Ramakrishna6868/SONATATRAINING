package javaindebuggingmode;
import java.util.*;

public class SortArrayListAscendingOrder {

	public static void main(String args[])
	{

		ArrayList<String>
			list = new ArrayList<String>();

		list.add("Geeks");
		list.add("For");
		list.add("ForGeeks");
		list.add("GeeksForGeeks");
		list.add("A computer portal");

		System.out.println("Unsorted ArrayList: "
						+ list);

		Collections.sort(list);

		System.out.println("Sorted ArrayList "
						+ "in Ascending order : "
						+ list);
	}
}
