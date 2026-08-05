package ProgramsOnIf;

import java.util.Scanner;

//To check Wheather the Entered year is leap year or not 
public class Problem8 {
	int num;

	public String leapYear(int num) {
		if (num % 400 == 0 || (num % 4 == 0 && num % 100 != 0)) {
			return num + " is a Leap Year.";
		} else {
			return num + " is Not a Leap Year.";
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year TO Check it is Leap Year or Not : ");
		Problem8 obj = new Problem8();
		obj.num = sc.nextInt();

		String s = obj.leapYear(obj.num);
		System.out.println(s);
	}
}
