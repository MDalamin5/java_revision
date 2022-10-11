package aLLaBOUTsUPERkEYWORD;

public class Vehicle {
	
	String color;
	double weight;
	
	Vehicle(String color, double weight)
	{
		this.color= color;
		this.weight= weight;
	}
	
	void atrubuite()
	{
		System.out.println("Color is: "+color);
		System.out.println("Weight: "+weight);
	}

}
