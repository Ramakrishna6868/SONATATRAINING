package javaindebuggingmode;
import java.util.*;
public class CollectionsEx14 {

	public static void main(String args[])
	{
		String countryArray[]
			= { "India", "Pakistan", "Afganistan",
				"Srilanka" };
	
		System.out.println("Array input: "
						+ Arrays.toString(countryArray));

		List countryList = Arrays.asList(countryArray);
		System.out.println("Converted elements: "
						+ countryList);
	}
}

