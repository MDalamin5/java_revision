package Practice;

public class Privet_Static {
	
	private String name;
	private int age;
	static String UniName= "NSU";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void display()
	{
		System.out.println("Name is: "+ name);
		System.out.println("Age is: "+age);
		System.out.println("University Name: "+UniName);
	}

}
