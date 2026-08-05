package IF;

public class DivisibleBy3and5 {

	public static void main(String[] args) {
		int num =15;
		
		
		System.out.println("----- Main Start -----");
		System.out.println("Check if Number is divisible by 3 and 5");
		
		
		if(num % 3 == 0 && num % 5 == 0) {
			
			System.out.println("The Given Number is Divisible By both 3 and 5.");
		}
		else {
			System.out.println("The Given Number is not Divisible by 3 and 5.");
		}
		
		System.out.println("----- Main End -----");
	}	
}
