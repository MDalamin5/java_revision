package Practice;

public class S_car extends S_Vhecle {
	int gera;
	
	S_car(String color, int weight,int gera)
	{
		super(color,weight);
		this.gera=gera;
		
	}
	
	void display()
	{
		super.display();
		System.out.println("No of Gear: "+gera);
	}

}
