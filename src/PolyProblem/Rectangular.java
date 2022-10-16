package PolyProblem;

public class Rectangular extends Shape {
     
	double length, width;
	
	Rectangular(double length, double width)
	{
		this.length= length;
		this.width= width;
		
	}
	
	double area()
	{
		return length*width;
	}
	
	
	
}
