package ProgramsOnIf;

import java.util.Scanner;

// AccePt an Alphabet & check Whether it is Vowel or vowel not.
public class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet : ");
		char c = sc.next().charAt(0);
		if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
					|| c == 'u') {
				System.out.println(c + " is an Vowel.");
			} else {
				System.out.println(c + " is not a Vowel.");
			}
		} else {
			System.out.println("Incorrect Details filled. Kindly Enter a Alphabet.");
		}
	}
}
