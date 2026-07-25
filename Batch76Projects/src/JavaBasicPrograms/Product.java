package JavaBasicPrograms;

public class Product {
	int pid = 43787;
	String pname = "TV";
	
	public void m1() {
		Product p = new Product();
		System.out.println("Product ID : "+ p.pid);
		System.out.println("Product Name : " + p.pname);
		
	}
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.m1();
		System.out.println(p1.pid + " " + p1.pname);
	}
}
