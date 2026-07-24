package StudentMgtSystem;

public class AdminController {
	public static void main(String[] args) {

		StudentDetails SD = new StudentDetails();
		
		System.out.println("\n*******************************************************************");
		System.out.println("      The Student Management System Project Using Return Type      ");
		System.out.println("*******************************************************************");
		
		System.out.println("\n--------------------------------------------------");
		Student s = SD.addStudent();
		System.out.println("--------------------------------------------------");
		System.out.println("\nStudent Name : " + s.sname);
		System.out.println("Student ROll No : " + s.rollno);
		System.out.println("Course : " + s.course);
		System.out.println("Stream : " + s.sstream);
		
		System.out.println("\n--------------------------------------------------");
		College c = SD.addCollege();
		System.out.println("--------------------------------------------------");
		System.out.println("\nCollege Name : " + c.cname);
		System.out.println("College Code : " + c.ccode);
		System.out.println("College Address : " + c.cadd);

		System.out.println("\n--------------------------------------------------");
		University u = SD.addUniversity();
		System.out.println("--------------------------------------------------");
		System.out.println("\nUniversity Id : " + u.uid);
		System.out.println("University Name : " + u.uname);
		System.out.println("\nxxxxxxxxxxxxxxxxxxxxxx The End xxxxxxxxxxxxxxxxxxxxxx");
	}
}
