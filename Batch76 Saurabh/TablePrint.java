package Table_Printing_Progrram;
import java.util.Scanner;

public class TablePrint{
public static void main(String[] args)
{
System.out.println("Enter the Number For the Table : ");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
System.out.println("The Table of " + num + " is :");
//switch(num){
//	case 1:
int i = 1;
		for(i = 1 ; i <= 10 ; i++)
		{
			System.out.println(num + " X " + i + " = "+ num*i);

		}



//}

}
}