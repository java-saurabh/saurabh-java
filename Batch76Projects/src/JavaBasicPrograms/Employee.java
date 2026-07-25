package JavaBasicPrograms;

public class Employee{

public void displayCompany(){

	System.out.println("Company Name: Infosys \nCompany ID: 249749284 \nCompany Address: Pune");
}

public void displayEmployee(){

	System.out.println("Emp Name: Saurabh \nEmp ID: 2000155194 \nNumber: 9145586954");
}
	
public static void main(String[] args)
{
	Employee e = new Employee();

	System.out.println("******Company Details******");	
	e.displayCompany();
	System.out.println("\n******Employee Details******");
	e.displayEmployee();
	System.out.println("   \"  ");
	System.out.println("  \\\\ ");
	System.out.println("   \"Saurabh Nimje\" ");

}

}