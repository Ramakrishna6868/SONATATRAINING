package javaindebuggingmode;

import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner in=new Scanner(System.in);
   String s=in.nextLine();
   System.out.println("you entered String"+s);
   int a=in.nextInt();
   System.out.println("You entered integer"+a);
   float b=in.nextFloat();
   System.out.println("you entered float"+b);
	}

}
