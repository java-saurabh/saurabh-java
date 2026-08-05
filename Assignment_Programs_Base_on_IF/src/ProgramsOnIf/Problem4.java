package ProgramsOnIf;
// To Check whether the Number is Even or Odd.
import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("The Number " + n + " is Even Number.");
		}
		else {
			System.out.println("The Number " + n + " is Odd Number.");
		}
	}
}
