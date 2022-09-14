package javaindebuggingmode;

import java.io.*;
import java.util.*;
public class TestNext
{

	public static void main(String[] args)
	{
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Element1");
		list.add("Element2");
		list.add("Element3");
		
		Iterator<String> iterator = list.iterator();
		
		System.out.println(iterator.next());

		System.out.println(iterator.next());

		System.out.println(iterator.next());
	}
}

