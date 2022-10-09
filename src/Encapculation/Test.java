package Encapculation;

public class Test {
public static void main(String[] args) {
	
	Person ob = new Person();
	
	ob.setName("Al Amin");
	System.out.println("Name: "+ ob.getName());
	
	ob.SetINt(24);
	
	int result = ob.GetAge();
	
	System.out.println(result);
	
}
}
