package javaindebuggingmode;

public class TestOvelOrConsonantMethod3 {

	static String osVowel(char ch)
	{
		String str="aeiouAEIOU";
		return (str.indexOf(ch)!=-1)?"Vowel":"Consonant";
	}
	public static void main(String[] args) {
		System.out.println("It is a"+osVowel('a'));
		System.out.println("It is a"+osVowel('x'));
	}
}
