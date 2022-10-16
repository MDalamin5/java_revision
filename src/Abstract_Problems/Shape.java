package Abstract_Problems;

public abstract class Shape {
	
	double value1, value2;
	
	Shape(double value1, double value2)
	{
		this.value1= value1;
		this.value2= value2;
	}
	
	
	abstract void area();

}
