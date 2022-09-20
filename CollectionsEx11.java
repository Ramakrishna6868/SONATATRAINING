package javaindebuggingmode;
import java.util.*;
public class CollectionsEx11 {

	public static void main(String[] args)
	{

		Integer arr[] = { 10, 20, 30, 40, 50 };

		System.out.println("Original Array : "
						+ Arrays.toString(arr));

		Collections.reverse(Arrays.asList(arr));

		System.out.println("Modified Array : "
						+ Arrays.toString(arr));
	}
}

