package javaindebuggingmode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx4 {

	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<>();
//		list.add("hi");
//		list.add("how are you");
//		for(String i:list)
//		{
//			System.out.println(i);
//		}
			Arrays.asList(1,2,3);
		System.out.println("List : " + list.toString());

		list.add(5);
		System.out.println("Modified list : " + list.toString());
	}
}

