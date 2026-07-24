import java.util.Scanner;
class TablePrint{
public static void main(String[] args)
{
System.out.println("Enter the Number For the Table : ");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
System.out.println("The Table of " + num + " is :");
 int i = 1;
		for(i = 1 ; i <= 10 ; i++)
		{
			System.out.println(num + " X " + i + " = "+ num*i);

		}


}
}