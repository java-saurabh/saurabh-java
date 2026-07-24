package Com.StudentManagement_System;

public class AdminController {

//	public void setData() {
//
//		System.out.println("The Student Name : "+ rollno );
//
//	}

	public static void main(String[] args) {
		AdminController AC = new AdminController();
		System.out.println("The Student Management Details Are Differentiate in Four Diffrent Parts. \nBelow are The Details Section Wise \nPlease Check it Thank you!!\n");
		System.out.println("--------------------------------------------");
		Student s = new Student();
		s.rollno = 6483;
		// int rollno = s.rollno;
		s.sname = "Bhushan Raut";
		s.f.fid = 2478;
		s.f.fname = "Nilesh Ugale";
		s.f.b.bid = 76;
		s.f.b.bname = "Morning Batch";
		s.f.b.c.cid = 1;
		s.f.b.c.cname = "Java Fullstack";

		System.out.println("The Student Details Are : \n--------------------------------------------\nStudent Name : "
				+ s.sname + "\nStudent Roll no : " + s.rollno
				+ "\n--------------------------------------------\nThe Faculty Details Are : \n--------------------------------------------\nFaculty ID : "
				+ s.f.fid + "\nFaculty Name : " + s.f.fname
				+ "\n--------------------------------------------\nThe Batch Details Are : \n--------------------------------------------\nBatch ID : "
				+ s.f.b.bid + "\nBatch Name : " + s.f.b.bname
				+ "\n--------------------------------------------\nThe Course Details Are : \n--------------------------------------------\nCourse ID : "
				+ s.f.b.c.cid + "\nCourse Name : " + s.f.b.c.cname + "\n--------------------------------------------");
	}
}
