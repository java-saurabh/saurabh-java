package EmployeeManagementsystem;

public class Department {
	public Employee addEmployee()
	{
		Employee emp = new Employee();
		emp.eid = 323;
		emp.name = "Abhilash Borkar";
		emp.salary = 22000.00;
		return emp;
	}
	
	public AllEmployee addAllEmployee() {
		
		AllEmployee empall = new AllEmployee();
		empall.Sameer.eid = 47364;
		empall.Sameer.name = "Sameer Raut";
		empall.Sameer.salary = 12000.90;
	
		empall.Sejal.eid = 473474;
		empall.Sejal.name = "Sejal Khelkar";
		empall.Sejal.salary = 8000.90;
		
		empall.Nilima.eid = 434374;
		empall.Nilima.name = "Nilima Deotare";
		empall.Nilima.salary = 13560.90;
		
		empall.Prachi.eid = 47393940;
		empall.Prachi.name = "Prachi Chitriv";
		empall.Prachi.salary = 12399.90;
		
		return empall;
	}
}
