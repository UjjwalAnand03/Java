package Basics;

import java.util.Scanner;

public class ScnnerTry {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter first value:");
	double value1 = scn.nextDouble();
	System.out.println("Enter Second Value");
	double value2 = scn.nextDouble();
	//System.out.println("The result is"+value1+value2);
	double result = value1 + value2;
	System.out.println("The result is "+result);
	scn.close();
}
}
