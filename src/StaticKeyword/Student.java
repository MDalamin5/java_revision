package StaticKeyword;

public class Student {
   
	String name, id;
	static String UniName = "NSU";
	
	Student(String name, String id){
		this.name= name;
		this.id= id;
		
	}
	
	void display()
	{
		System.out.println("Student Name: "+name);
		System.out.println("Student ID: "+id);
		System.out.println("Student University Name: "+UniName);
		System.out.println();
	}
	
	
	
}
