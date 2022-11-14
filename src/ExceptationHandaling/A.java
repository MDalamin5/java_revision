package ExceptationHandaling;

public class A {
    public static void main(String[] args) {
        
        
        try
        {
            int x=20;
            int y=0;
            int result = x/y;
            System.out.println(result);
        }
        catch(ArithmeticException value)
        {
            System.out.println("Exceptation is: "+value);
        }
        
        catch(ArrayIndexOutOfBoundsException value1 )
        {
            System.out.println("Exception is: "+value1);
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        finally {
            System.out.println("Last line");
        }
        
        
        
        
        
    }

}
