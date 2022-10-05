package OverLoadingCons;

public class Test {

	public static void main(String[] args) {
		
		Teacher ob= new Teacher();
		ob.display();
		
		Teacher ob1 = new Teacher("Almin", 25000);
		ob1.display();
		
		Teacher ob2 = new Teacher("Kaysar", "25", 25000);
		ob2.display();
		
	}
	
	
}
