package ParameterizedMethod;

public class teacher {
	
	String name, id;
	int age;
	
	void setInfor(String name,String id, int age)
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
