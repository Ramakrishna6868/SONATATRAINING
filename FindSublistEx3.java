package javaindebuggingmode;
import java.util.*;
public class FindSublistEx3 {

	public static void main(String[] argv) throws Exception
	{
		try {

			ArrayList<String> arrlist = new ArrayList<String>();
			arrlist.add("Example");
			arrlist.add("in");
			arrlist.add("Geeks");
			arrlist.add("for");
			arrlist.add("Geeks");

			System.out.println("Original arrlist: "
							+ arrlist);
			System.out.println("\nEndpoint indices "
							+ "are out of order"
							+ " (fromIndex > toIndex)");
			List<String> arrlist2 = arrlist.subList(9, 3);


			System.out.println("Sublist of arrlist: "
							+ arrlist2);
			}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("Exception thrown: " + e);
		}


		catch (IllegalArgumentException e)
		{
			System.out.println("Exception thrown: " + e);
		}
		
	}
	
}

