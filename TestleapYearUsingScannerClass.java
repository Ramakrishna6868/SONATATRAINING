package javatraining;

import java.util.Scanner;

public class TestleapYearUsingScannerClass {
	public static void main(String[] args) {
		
		int year;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an year\n");
		year=s.nextInt();
		if((year % 400==0)||((year%4==0)&&(year%100!=0)))
		{
			System.out.println(year+":Leap Year");
		}
		else
		{
			System.out.println(year+":Non-Leap Year");
		}
	}

}
