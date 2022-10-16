package Abstract_Problems;

public class Rectangle extends Shape {
	
	Rectangle(double value1, double value2)
	{
		super(value1,value2);
	}
	
	void area()
	{
		System.out.println("The area of Rectangle is: "+ (.5*value1*value2)); 
	}

}
