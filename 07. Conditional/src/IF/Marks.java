package IF;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {

		int marks;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== Main Start =====");
		System.out.println("Enter your Number : ");
		marks = sc.nextInt();
		if (marks > 90) {

			System.out.println("The Student is Pass With First Class");

		}
		else if (marks > 75) {

			System.out.println("The Student is Pass With Distinction");
		}

		else if (marks > 60) {

			System.out.println("The Student is Pass With Second Class");
		}

		else if (marks > 35) {

			System.out.println("The Student is Pass.");
		}

		else {

			System.out.println("The Student is Fail");
		}

		System.out.println("===== Main End =====");
	}
}
