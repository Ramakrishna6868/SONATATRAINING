package javaindebuggingmode;

import java.util.*;

public class CollectionsEx8 {

	public static void main(String[] args)
	{

		ArrayList<String> mylist = new ArrayList<String>();

		mylist.add("code");
		mylist.add("quiz");
		mylist.add("geeksforgeeks");
		mylist.add("quiz");
		mylist.add("practice");
		mylist.add("qa");

		System.out.println("Original List : \n" + mylist);

		Collections.shuffle(mylist, new Random());

		System.out.println(
			"\nShuffled List with Random() : \n" + mylist);

		Collections.shuffle(mylist, new Random(3));

		System.out.println(
			"\nShuffled List with Random(3) : \n" + mylist);

		Collections.shuffle(mylist, new Random(5));

		System.out.println(
			"\nShuffled List with Random(5) : \n" + mylist);
	}
}

