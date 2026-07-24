class Employee{

	int eid;
	String ename;

	Employee(){
	System.out.println("This is Employee class Constructor!!!");
		
}
public static void main(String[] args){

	Employee e = new Employee();
	System.out.println(e.eid + " " + e.ename);

}



}