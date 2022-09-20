package javaindebuggingmode;

import java.util.*;

public class CollectionsEx10 {

	public static void main(String[] args)
	{
		List<String> mylist = new LinkedList<String>();

		mylist.add("practice");
		mylist.add("code");
		mylist.add("quiz");
		mylist.add("geeksforgeeks");

		System.out.println("Original List : " + mylist);

		Collections.reverse(mylist);

		System.out.println("Modified List: " + mylist);
	}
}

