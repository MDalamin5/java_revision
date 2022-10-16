package Polymorphism;

public class Test1 {
public static void main(String[] args) {
	
	Person ob = new Person();
			ob.display();
	
	ob = new Teacher();
	ob.display();
	
	ob= new Student();
	ob.display();
	
	
}
}
