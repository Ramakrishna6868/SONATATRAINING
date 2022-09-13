package javaindebuggingmode;


class TestThisKeyword
{
	int a;
	int b;
	TestThisKeyword(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	void display()
	{

		System.out.println("a = " + a + " b = " + b);
	}

	public static void main(String[] args)
	{
		TestThisKeyword object = new TestThisKeyword(10, 20);
		object.display();
	}
}

