package ProgramsOnIf;
// Check wheather the number is even or odd using return type with conditional Statement
import java.util.Scanner;

public class CQ1 {
	int n;
	public String isEven(int n) {
		if(n % 2 == 0) {
			return "This is Even Number.";
		}else {
			return "This is Odd Number.";
		}
	}
	
	public static void main(String[] args) {
		CQ1 obj = new CQ1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		obj.n =sc.nextInt();
		System.out.println(obj.isEven(obj.n));
	}
}
