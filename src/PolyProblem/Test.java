package PolyProblem;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		/*
		Shape ob = new Shape();
		
		ob = new Triangle(10,25);
		System.out.println(ob.area());
		
		ob = new Rectangular(10,25);
		System.out.println(ob.area());
		*/
		
		Shape[] s = new Shape[3];
		
		s[0] = new Triangle(10,25);
		s[1]= new Rectangular(10,25);
		s[2] = new Shape();
		
	   for (int i = 0; i < s.length; i++) {
		System.out.println(s[i].area());
	}
	}
	
	
	
}
