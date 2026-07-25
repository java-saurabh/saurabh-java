package JavaBasicPrograms;

public class Laptop {
	int srno = 1338973;
	String brandName = "Asus";
	
public void laptopDetails(){
	String processor = "Qualcom";
	int screenSize = 24;
	System.out.println(processor);
	System.out.println(screenSize);	


}

public static void main(String[] args){
	Laptop LP = new Laptop();
	System.out.println("Serial Number : "+ LP.srno);
	System.out.println("Brand Name : "+ LP.brandName);
	System.out.println("The Laptop Details of \"laptopDetails Method are given Below\"");
	LP.laptopDetails();



}
}