package Array;

import java.util.Scanner;

public class MaxAndMinumam {
    public static void main(String[] args) {
        
        int[] array = new int[5];
        Scanner input = new Scanner(System.in);
        
     for (int i = 0; i < array.length; i++) {
         
         System.out.printf("Enter Array[%d]: ",i);
         array[i]= input.nextInt();
        
         
    }int sum=0;
     
for (int i = 0; i < array.length; i++) {
         
      sum= sum+array[i];
        
        
         
    }
        System.out.println(sum);
        
        
        double max= array[0];
        
        for (int i = 1; i < array.length; i++) {
            
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        
        System.out.println(max);
    }

}
