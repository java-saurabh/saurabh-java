package ProgramsOnIf;

import java.util.Scanner;

public class CQ3 {
	int n;

	public String m1(int n) {
		if (n % 3 == 0 && n % 5 == 0) {
			return "The Given Number is Divisible by both 3 & 5.";
		} else {
			return "The Given Number is not Divisible by both 3 & 5.";
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CQ3 obj = new CQ3();
		System.out.println("Enter the Number : ");
		obj.n = sc.nextInt();
		System.out.println(obj.m1(obj.n));
	}
}
