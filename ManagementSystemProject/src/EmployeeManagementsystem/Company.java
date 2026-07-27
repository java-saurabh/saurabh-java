package EmployeeManagementsystem;

public class Company {
	public static void main(String[] args) {
		Department dpt = new Department();
		Employee D1 = dpt.addEmployee();
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("The single Employee Details : ");
		System.out.println("----------------------------------------");
		System.out.println("Name : " + D1.name+ "\nEmployee ID : " + D1.eid + "\nSalary : "+ D1.salary+ "/-");
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	
		
		System.out.println("\nAll Employee Details Are : ");
		AllEmployee D2= dpt.addAllEmployee();
		System.out.println("----------------------------------------");
		System.out.println("1] Name : " + D2.Sameer.name+ "\nEmployee ID : " + D2.Sameer.eid + "\nSalary : "+ D2.Sameer.salary+ "/-");
		
		System.out.println("========================================");
		
		System.out.println("2] Name : " + D2.Nilima.name+ "\nEmployee ID : " + D2.Nilima.eid + "\nSalary : "+ D2.Nilima.salary+ "/-");
		
		System.out.println("========================================");

		System.out.println("3] Name : " + D2.Prachi.name+ "\nEmployee ID : " + D2.Prachi.eid + "\nSalary : "+ D2.Prachi.salary + "/-");
		
		System.out.println("========================================");
		
		System.out.println("4] Name : " + D2.Sejal.name+ "\nEmployee ID : " + D2.Sejal.eid + "\nSalary : "+ D2.Sejal.salary+ "/-");
		System.out.println("========================================");
	
	}
}
