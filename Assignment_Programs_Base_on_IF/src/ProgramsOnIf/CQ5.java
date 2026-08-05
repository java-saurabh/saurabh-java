package ProgramsOnIf;

import java.util.Scanner;

public class CQ5 {
	int i;
	int j;
	int k;
	public int largeNumber(int i, int j, int k) {
		if (i > j) {
			if (i > k) {
				return i;
			} else {
				return k;
			}
		} else if (j > k) {
			return j;
		} else {
			return k;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CQ5 obj = new CQ5();
		System.out.println("Enter the First Number : ");
		obj.i = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		obj.j = sc.nextInt();
		System.out.println("Enter the Third Number : ");
		obj.k = sc.nextInt();
		int large = obj.largeNumber(obj.i, obj.j, obj.k);
		System.out.println("The Number " + large + " is the Largest Number.");
	}
}
