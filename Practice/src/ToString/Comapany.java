package ToString;

public class Comapany {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.setDept("Healthcare");
		emp.setEid(12137);
		emp.setName("Saurabh Nimje");
		emp.setSalary(25000);
		emp.setTenure("1 year ");
		emp.setDesignation("Adjudicator Analyst");
		
		System.out.println(emp);
	}
	
}
