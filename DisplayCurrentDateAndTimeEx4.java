package javaindebuggingmode;


import java.time.*;

public class DisplayCurrentDateAndTimeEx4 {


	public static void main (String[] args)
	{
		System.out.println(Clock.systemUTC().instant());
	}
}

