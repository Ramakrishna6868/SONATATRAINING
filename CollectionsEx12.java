package javaindebuggingmode;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsEx12 {

	public static void main(String[] args)
	{

		List<String> list = new ArrayList<String>();

		list.add("Geeks ");
		list.add("for ");
		list.add("Geeks ");
		list.add("is ");
		list.add("the ");
		list.add("Best.");

		String[] str = list.toArray(new String[0]);

		for (int i = 0; i < str.length; i++) {
			String data = str[i];

			System.out.print(data);
		}
	}
}
