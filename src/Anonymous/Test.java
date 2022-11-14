package Anonymous;

public class Test {

    public static void main(String[] args) {
        
        Person ob = new Person()
                {
                    void display()
                    {
                        System.out.println("Hi, i'm anonymus class");
                    }
                };
                
                ob.display();
    }
}
