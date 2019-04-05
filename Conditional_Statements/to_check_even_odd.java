package Conditional_Statements;

import java.util.Scanner;

public class to_check_even_odd {
	
	public static void main( String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		Double number= sc.nextDouble();
		if(number%2==0) {
			System.out.println(number + " "+ "is an even number.");
		}
		else
			{
				System.out.println(number + " " + " is an odd number.");
			}
		sc.close();
		}
		
	}


