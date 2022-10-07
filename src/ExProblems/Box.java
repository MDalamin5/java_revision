package ExProblems;

public class Box {
	
   double height, width, depth;
   
   Box(double height, double width, double depth)
   {
	   this.height= height;
	   this.width= width;
	   this.depth= depth;
   }
   
   void displayVol()
   {
	   System.out.println("The volume of the box = "+ height*width*depth);
   }

}
