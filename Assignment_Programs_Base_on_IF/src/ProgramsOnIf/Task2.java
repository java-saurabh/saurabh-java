package ProgramsOnIf;
// To check Wheather the number is Multiple of 3 & 5
public class Task2 {
	public static void main(String[] args) {
		int n = 30;
		
		if(n % 3 == 0 && n % 5 == 0)
		{
			System.out.println("The Given Number is Multiple of Both 3 & 5.");
		}
		else {
			System.out.println("The Given Number is not Multiple of Both 3 & 5.");
		}
	}
}
