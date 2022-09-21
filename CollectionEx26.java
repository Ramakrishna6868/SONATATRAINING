package javaindebuggingmode;

public class CollectionEx26 {
	public static byte convertStringToByte(String str)
	{

		return Byte.valueOf(str);
	}

	public static void main(String[] args)
	{

		String stringValue = "1";

		byte byteValue;

		byteValue = convertStringToByte(stringValue);

		System.out.println(
			stringValue
			+ " after converting into byte = "
			+ byteValue);
	}
}

