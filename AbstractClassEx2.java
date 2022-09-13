package javaindebuggingmode;

abstract class Basecl {

	Basecl()
	{

		System.out.println("Base Constructor Called");
	}


	abstract void fun();
}

class Derivedcl extends Basecl {

	Derivedcl()
	{
		System.out.println("Derived Constructor Called");
	}

	void fun()
	{
		System.out.println("Derived fun() called");
	}
}

public class AbstractClassEx2 {

	public static void main(String args[])
	{

		Derivedcl d = new Derivedcl();
		
		d.fun();
	}
}





