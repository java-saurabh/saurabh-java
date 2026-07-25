package JavaBasicPrograms;

public class Mobile {
		int imeino = 1338973682;
		String CName = "Motorola";
		
	public void mobileDetails(){
		String ram = "12 GB";
		String Battery = "5000mah";
		System.out.println(ram);
		System.out.println(Battery);	


	}

	public static void main(String[] args){
		Mobile m = new Mobile();
		System.out.println("IMEI Number : "+ m.imeino);
		System.out.println("Mobile Brand : "+ m.CName);
		System.out.println("The Mobile Details of \"Mobile Details\"Method are given Below");
		m.mobileDetails();



	}
	}
