package ProgramsOnIf;
import java.util.Scanner;
public class CQ6 {
	int i,j,k,large,small;
	public CQ6 largeNumber(){
		CQ6 obj = new CQ6();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		obj.i = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		obj.j = sc.nextInt();
		System.out.println("Enter the Third Number : ");
		obj.k = sc.nextInt();
		if (obj.i > obj.j) {
			if (obj.i > obj.k) {
				obj.large = obj.i;
				obj.small = obj.j;
			} else {
				obj.large = obj.k;
				obj.small = obj.j;
			}
		} else if (obj.j > obj.k) {
			obj.large = obj.j;
			obj.small = obj.i;
		} else {
			obj.large = obj.k;
			obj.small = obj.i;
		}
		return obj;
	}
	public static void main(String[] args) {
		CQ6 c1 = new CQ6();
		CQ6 i = c1.largeNumber();
				System.out.println("The Largest Number : " + i.large + " and th Smallest Number : " + i.small);
	}
}
