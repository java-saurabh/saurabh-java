package ProgramsOnIf;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		
		if(age<0) {
			
		System.out.println("Entered Age is in Negative.\nKindly Enter your Age in Correct Format.");
		}
		else if(age < 12) {
			System.out.println("Still a Child.");
		}
		else if(age < 21) {
			System.out.println("Enjoy Teenager Life.");
		}
		else if(age < 40) {
			System.out.println("You Are Responsible Adult.");
		}
		else if(age < 70) {
			System.out.println("Respected Senior Citizen.");
		}
		else {
			System.out.println("Enough on Earth, Better To Check Out.😂😀😀");
		}
	}
}
