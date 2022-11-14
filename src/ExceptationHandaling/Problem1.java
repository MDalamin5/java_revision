package ExceptationHandaling;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
    
        while(true)
        {
            try {
                int num1,num2,result;
                
                Scanner input = new Scanner(System.in);
                
                
                
                    System.out.print("\nPlese entre num1: ");
                    num1= input.nextInt();
                    System.out.print("Please enter num2: ");
                    num2= input.nextInt();
                    
                    result = num1/num2;
                    
                    System.out.printf("Result: %d/%d = %d",num1,num2,result);
                
            }
            
            catch(Exception e)
            {
                System.out.println("Exception: "+e);
                System.out.println("You must enter interger. Please try again");
            }
        }
    
}
}
