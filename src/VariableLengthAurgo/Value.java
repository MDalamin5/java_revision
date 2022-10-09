package VariableLengthAurgo;

public class Value {
	
	void add(int ... num)
	{
		int sum= 0;
		
		for(int x: num)
		{
			sum= sum + x;
		}
		
		
		System.out.println("THe sum of the : "+sum);
	}

}
