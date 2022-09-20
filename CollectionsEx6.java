package javaindebuggingmode;

import java.io.*;
import java.util.*;

public class CollectionsEx6 {

	public static void main (String[] args) {
		
		Collection<String> arraylist = new ArrayList<String>();
		
		arraylist.add("Geeks");
		arraylist.add("for");
		arraylist.add("geeks");
		
		System.out.println("Size of the collection "+arraylist.size());
		
		System.out.println("Is the ArrayList empty: "
						+ arraylist.isEmpty());
	}
}

