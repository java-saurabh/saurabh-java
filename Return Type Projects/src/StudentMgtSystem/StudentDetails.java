package StudentMgtSystem;
public class StudentDetails {
	
	public Student addStudent() {
		
		Student s = new Student();
		System.out.println("The Student Details Are : ");
		s.rollno = 24928;
		s.sname = "Rushikesh Borkar";
		s.sstream = "Chemistry";
		s.course = "B.Sc(Chemistry)";
		return s;
	}
	
	public College addCollege() {
		
		College c = new College();
		System.out.println("The College Details Are : ");
		c.cname = "Kamla Nehru";
		c.ccode = 144;
		c.cadd = "Sakkardara , Nagpur";
		return c;
		
	}
	
	
	public University addUniversity() {
		
		University u = new University();
		System.out.println("The University Details Are : ");
		u.uid = 1 ;
		u.uname = "Rashtrasant Tukdoji Maharaj Nagpur University";
		return u;	
		
	}
}
