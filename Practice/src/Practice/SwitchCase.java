package Practice;

import java.util.Scanner;

public class SwitchCase {
	
	
	
	public void createAccount() {
		
		System.out.println("Enter First Name :");
		
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("---- Welcome To Bank ----");
		System.out.println("\nSelect the Services :");
		System.out.println("\n1.Create Account.");
		System.out.println("\n2.Withdraw Amount.");
		System.out.println("\n3.Deposit Amount.");
		System.out.println("\n4.Update Account Information.");
		System.out.println("\n5.Exit.");
		
		System.out.println("\nEnter The Coice : ");
		
		int choice = sc.nextInt(); 
		switch(choice) {
		case 1 : 
			System.out.println("Welcome to Create Account.");
			break;
		case 2 : 
			System.out.println("Withdraw Amount.");
			break;
		case 3 : 
			System.out.println("Deposit Amount.");
			break;
		case 4 : 
			System.out.println("Update Account Information.");
			break;
		case 5 : 
			System.out.println("Successfully Exit.");
			break;
			default : 
				System.out.println("Invalid Choice. Kindly Enter Correct Choice.");
			
		}
	}
}
