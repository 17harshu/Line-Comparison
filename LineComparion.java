package com.line.problems;

import java.util.Scanner;

public class LineComparion {
	int x1, x2, y1, y2;
	public static void lengthOfLine(int x1, int x2, int y1, int y2) {
		double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1)
				* (y2 - y1));

		System.out.println("Distance between two points :" + distance);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner sc= new Scanner(System.in);      
		System.out.print("Enter first number- ");  
		int x1= sc.nextInt();  
		System.out.print("Enter second number- ");  
		int y1= sc.nextInt();  
		System.out.print("Enter third number- ");  
		int x2= sc.nextInt(); 
		System.out.print("Enter fourth number- ");  
		int y2= sc.nextInt(); 
		
		lengthOfLine(x1, x2, y1, y2);
	}
}
