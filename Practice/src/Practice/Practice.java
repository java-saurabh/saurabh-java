package Practice;

public class Practice {
	static {

		System.out.println("This is Static Block");
		{
			System.out.println("This is Non static Block inside of Static Block");
		}
	}

	Practice() {

		System.out.println("This is Consrtructor Block");

	}

	public void m1() {

		System.out.println("This is M1 Method");
		{
			System.out.println("This is Non Static Block inside the m1 Method");

		}

	}

	public static void main(String[] args) {

		Practice p = new Practice();
		p.m1();

	}
}
