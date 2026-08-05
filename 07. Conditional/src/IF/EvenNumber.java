package IF;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		System.out.println("===== Main Start =====");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
	
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			
			System.out.println("The "+ num +" Number is Even Number.");
		}
	
	
		System.out.println("===== Main Start =====");
	}
}
