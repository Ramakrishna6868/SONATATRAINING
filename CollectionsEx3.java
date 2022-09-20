package javaindebuggingmode;
import java.util.*;

public class CollectionsEx3 {


	String firstName;
	String lastName;

	// Constructor
	CollectionsEx3(String fn, String ln)
	{
		firstName = fn;
		lastName = ln;
	}

	// Function- toString()
	public String toString()
	{
		// Over-riding the toString method to print the
		// collection
		return "| First Name : " + firstName
			+ " | LastName : " + lastName;
	}

	public static void main(String[] args)
	{
		HashMap<Integer, CollectionsEx3> hm
			= new HashMap<Integer, CollectionsEx3>();

		CollectionsEx3 p1
			= new CollectionsEx3("Mohit", "Singh");
		CollectionsEx3 p2
			= new CollectionsEx3("Tarun", "Anand");
		CollectionsEx3 p3
			= new CollectionsEx3("Madhu", "Singh");
		CollectionsEx3 p4
			= new CollectionsEx3("Rohit", "Ahuja");

		hm.put(101, p1);
		hm.put(102, p2);
		hm.put(103, p3);
		hm.put(104, p4);

		for (Map.Entry m : hm.entrySet())
			System.out.println(m.getKey() + " "
							+ m.getValue().toString());
	}
}
