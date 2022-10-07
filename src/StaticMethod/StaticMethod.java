package StaticMethod;

public class StaticMethod {
	
	static String name;
	static int age, salary;
	
	StaticMethod(String name, int age, int salary)
	{
		this.name=name;
		this.age= age;
		this.salary= salary;
	}
	
	
	static void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		
	}

}
