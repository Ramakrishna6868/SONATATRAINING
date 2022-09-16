package javaindebuggingmode;

import java.util.List;
public class ListEx10 {

	public static void main(String args[])
	{
		List<Integer> unmodifiableList = List.of(1, 2, 3);
		System.out.println("List : "
						+ unmodifiableList.toString());
	}
}
