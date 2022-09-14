package javaindebuggingmode;

class CodePointAt {
	public static void main(String[] args)
	{

		StringBuffer str = new StringBuffer();
		
		str.append("Geeksforgeeks");

		int unicode = str.codePointAt(10);

		System.out.println("Unicode of Character "
						+ "at Position 10 "
						+ "in StringBuffer = "
						+ unicode);
	}
}
