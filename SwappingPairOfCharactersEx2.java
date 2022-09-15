package javaindebuggingmode;

public class SwappingPairOfCharactersEx2 {

	public static String swapPairs(String str)
	{
		if (str == null || str.isEmpty())
			return str;

		int len = str.length();
		StringBuffer sb = new StringBuffer(len);
		for (int i = 0; i < len - 1; i += 2) {
			sb.append(str.charAt(i + 1));
			sb.append(str.charAt(i));
		}
		if (len % 2 != 0) {
			sb.append(str.charAt(len - 1));
		}
		return sb.toString();
	}
	public static void main(String args[])
	{
		String str = "GeeksForGeeks";
		System.out.println(swapPairs(str));
	}
}

