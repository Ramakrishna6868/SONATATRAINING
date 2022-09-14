package javaindebuggingmode;

import java.io.*;
import java.util.*;

public class TestHasNext {

	public static void main(String[] args)
	{
	
		ArrayList<String> list = new ArrayList<String>();

		list.add("Geeks");
		
		list.add("for Geeks");

		Iterator<String> iterator = list.iterator();

		System.out.println(iterator.hasNext());

		iterator.next();

		System.out.println(iterator.hasNext());

		iterator.next();

		System.out.println(iterator.hasNext());
	}
}

