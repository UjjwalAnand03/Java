package Basics;

import java.util.Scanner;

public class ScannerTrialPractice {
	
	public static void main (String args[])
	{
		
		Scanner sc = new Scanner(System.in);
	System.out.println("This is my first addition calculator");
	
	
	System.out.println("Enter one value:");
	Double value1= sc.nextDouble();
	System.out.println("Enter second value:");
	Double value2= sc.nextDouble();
	Double result= value1 + value2;
	System.out.println("The result is: " + result);
	
		
	}

}
