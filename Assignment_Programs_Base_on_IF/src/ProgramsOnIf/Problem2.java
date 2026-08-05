package ProgramsOnIf;

import java.util.Scanner;

// Accept an Age & Check you are Eligible for vote or not.
public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		
		if(age >= 18) {
			
			System.out.println("You are Eligible for Vote.");
		}
		else {
			System.out.println("You are Not Eligible for Vote.");
		}
	}
}
