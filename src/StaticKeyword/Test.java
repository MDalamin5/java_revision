package StaticKeyword;

public class Test {
public static void main(String[] args) {
	
	Student ob = new Student("Al Amin","1811904");
	ob.display();
	
	Student ob1 = new Student("Kaysar","1811905");
	ob1.display();
	
	System.out.println(StaticVariable.UniName);
	
}
}
