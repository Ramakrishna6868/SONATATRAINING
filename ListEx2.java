package javaindebuggingmode;
import java.util.*;
public class ListEx2 {
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<Integer>() {{
			add(1);
			add(3);
			} };
		System.out.println("ArrayList : " + list.toString());
		List<Integer> llist = new LinkedList<Integer>() {{
			add(2);
			add(4);
			} };
		System.out.println("LinkedList : " + llist.toString());
		List<Integer> stack = new Stack<Integer>() {{
			add(3);
			add(1);
			} };
		System.out.println("Stack : " + stack.toString());
	}
}
