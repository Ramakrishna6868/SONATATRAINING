package javaindebuggingmode;
import java.io.*;
import java.util.*;
public class CollectionsEx15 {

public static void main(String[] args) {

	try {

	ArrayList<String> list = new ArrayList<>();


	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");

	System.out.println(list);

	list.set(2, "E");

	System.out.println(list);

	}

	catch (Exception e) {

	System.out.println(e);
	}
}
}

