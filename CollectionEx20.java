package javaindebuggingmode;
import java.util.*;
public class CollectionEx20 {

	public static List<Character>
	convertStringToCharList(String str)
	{

		List<Character> chars = new ArrayList<>();

		for (char ch : str.toCharArray()) {

			chars.add(ch);
		}

		return chars;
	}

	public static void main(String[] args)
	{

		String str = "Geek";

		List<Character>
			chars = convertStringToCharList(str);

		System.out.println(chars);
	}
}

