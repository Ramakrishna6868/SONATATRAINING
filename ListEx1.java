package javaindebuggingmode;

import java.util.*;

public class ListEx1 {

	public static void main(String args[])
	{
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(3);
		System.out.println("ArrayList : "+ l1.toString());
		List<Integer> llist = new LinkedList<Integer>();
		llist.add(2);
		llist.add(4);
		System.out.println("LinkedList : " + llist.toString());
		List<Integer> stack = new Stack<Integer>();
		stack.add(3);
		stack.add(1);
		System.out.println("Stack : " + stack.toString());
	}
}

