package Practice;

public class S_Vhecle {
	
	String color;
	int weight;
	
	S_Vhecle(String color, int weight)
	{
		this.color= color;
		this.weight= weight;
	}
	
	void display()
	{
		System.out.println("Color is: "+color);
		System.out.println("Weight: "+weight);
	}

}
