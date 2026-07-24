class ConstructorBlock{
	int i = 1398;
	String add = "Pune - Nagpur";
ConstructorBlock(){
	System.out.println("****** This is Constructor Block ******");
	}
	public static void main(String [] args){
		System.out.println("****** This Is Main Method******");
		ConstructorBlock cb = new ConstructorBlock();
		System.out.println("This is I & its value is "+ cb.i);
	System.out.println("Constructor block in Java is Very essential because it is used for initialization. This block Execute after creating a Object of class. If developer not define the constructor then JVM will add Constructor by itself. If developer define the constructor then JVM will consider the Developer define constructor as default constructor.");
}

}