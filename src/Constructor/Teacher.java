package Constructor;

public class Teacher {
	String name, id;
	int age;
	
	Teacher(){
		System.out.println("No parametr here ");
	}
	
	Teacher(String name,String id, int age)
	{
		this.name= name;
		this.id= id;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("Age: "+age);
	}
	
	
}
