package javaindebuggingmode;

public class TestOwelOrConsonantMethod2 {
	static void Voel_Or_Consonant(char y)
	{
		if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u'||y=='A'||y=='E'||y=='I'||y=='O'||y=='U')
			System.out.println("It is a Vowel");
		else
			System.out.println("It is a Consonant");
	}
	public static void main(String[] args) {
		Voel_Or_Consonant('W');
		Voel_Or_Consonant('I');
	}

}
