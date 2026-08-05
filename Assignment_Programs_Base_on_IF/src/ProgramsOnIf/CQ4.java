package ProgramsOnIf;

import java.util.Scanner;

public class CQ4 {
	int n;

	public String checkNumber(int n) {
		if (n == 0) {
			return "The Given Number is Zero.";
		} else if (n > 0)

		{
			if (n % 2 == 0) {
				return "The Given Number is Even Number.";
			} else {
				return "The Given Number is Odd Number.";
			}
		} else {
			return "The Given Number is Negative Number.Kindly Enter a Positive Number.";
		}
	}
	
	public static void main(String[] args) {
		CQ4 obj = new CQ4();
		System.out.println("Enter The Number : ");
		Scanner sc = new Scanner(System.in);
		obj.n = sc.nextInt();
		System.out.println(obj.checkNumber(obj.n));
	}
}
