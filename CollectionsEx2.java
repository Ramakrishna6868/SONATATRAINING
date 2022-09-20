package javaindebuggingmode;

import java.util.*;

public class CollectionsEx2 {



		String name;
		int rollNo;

		CollectionsEx2(String s, int n)
		{
			name = s;
			rollNo = n;
		}
		public String toString()
		{
			return "Name : " + name + " | Roll No : " + rollNo;
		}

		public static void main(String[] args)
		{
			ArrayList<CollectionsEx2> arr = new ArrayList<CollectionsEx2>();

			CollectionsEx2 t1 = new CollectionsEx2("John", 101);
			CollectionsEx2 t2 = new CollectionsEx2("Paul", 102);
			CollectionsEx2 t3 = new CollectionsEx2("Jack", 103);
			CollectionsEx2 t4 = new CollectionsEx2("Jose", 104);

			arr.add(t1);
			arr.add(t2);
			arr.add(t3);
			arr.add(t4);

			for (CollectionsEx2 c : arr)
				System.out.println(c);
		}
	}

