package aLLaBOUTsUPERkEYWORD;

public class Car extends Vehicle{

	int gear;
	
	Car(String color, double weight, int gear)
	{
		super(color, weight);
		this.gear= gear;
		
	}
	
	
	void atrubuite()
	{
		super.atrubuite();
		System.out.println("No of Gear is: "+gear);
	}
}
