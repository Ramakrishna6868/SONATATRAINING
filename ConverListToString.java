package javaindebuggingmode;

import java.util.*;
public class ConverListToString {

	public static void main(String args[])
	{


		List<String>
			list = new ArrayList<>(
				Arrays
					.asList("Geeks",
							"ForGeeks",
							"GeeksForGeeks"));

		System.out.println("List of String: " + list);

		String string = String.join(", ", list);

		System.out.println("Comma separated String: "
						+ string);
	}
}

