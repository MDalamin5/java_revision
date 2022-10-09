package MethodOverload;

public class MethOver {
	
	void add()
	{
		System.out.println("Empty Output");
	}
	
	void add(int a, int b)
	{
		System.out.println("Sum of this number: "+ (a+b));
	}
	
	void add(double a, double d)

	{
		System.out.println("Sum of : "+ (a+d));
	}
	
	void add(int a, int b, int c)
	{
		System.out.println("Sum of two number: "+ (a+b+c));
	}
}
