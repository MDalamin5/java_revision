package OverLoadingCons;

public class Teacher {

	String name, age;
	int salary;
	
	Teacher(){
		System.out.println("No Paramiter is hare");
	}
	
	Teacher(String name, int salary){
		this.name= name;
		this.salary= salary;
	}
	
	Teacher(String name, String age, int salary)
	{
		this.name= name;
		this.age= age;
		this.salary= salary;
	}
	
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		System.out.println(); 
	}
	
}
