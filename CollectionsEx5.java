package javaindebuggingmode;

import java.io.*;
import java.util.*;

public class CollectionsEx5 {

	public static void main (String[] args) {
		
		Collection<Integer> list = new LinkedList<Integer>();
		
		list.add(99);
		list.add(54);
		list.add(112);
		list.add(184);
		list.add(2);
		
		System.out.print("The elements in Collection : ");
		System.out.println(list);
		
		System.out.println("Size of the collection "+list.size());
		
		System.out.println("Is the LinkedList empty: "
						+ list.isEmpty());
		list.clear();
	
		System.out.println("The new List is: " + list);
	
		System.out.println("Is the LinkedList empty: "
						+ list.isEmpty());
	}
}

