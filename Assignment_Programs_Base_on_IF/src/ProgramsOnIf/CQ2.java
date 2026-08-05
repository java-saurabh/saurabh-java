package ProgramsOnIf;

import java.util.Scanner;

// Print the Grade According to the marks 
//>= 90 → "A">= 75 → "B" >= 60 → "C">= 40 → "D"< 40 → "Fail"
public class CQ2 {
	int marks;

	public String grade(int marks) {
		if(marks >= 0 && marks <= 100 ) {
		if (marks >= 90 && marks <= 100) {
			return "Student is Pass with Grade \"A\".";
		} else if (marks >= 75 && marks < 90) {
			return "Student is Pass with Grade \"B\".";
		} else if (marks >= 60 && marks < 75) {
			return "Student is Pass with Grade \"C\".";
		} else if (marks >= 40 && marks < 60) {
			return "Student is Pass with Grade \"D\".";
		} else {
			return "Student is \"Fail\".";
		}
		}else
		{
			return "Incorrect Marks Enterd. Kindly Enter Correct Marks.";
		}
	}

	public static void main(String[] args) {
		CQ2 obj = new CQ2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks : ");
		obj.marks = sc.nextInt();
		String s = obj.grade(obj.marks);
		System.out.println(s);
	}
}
