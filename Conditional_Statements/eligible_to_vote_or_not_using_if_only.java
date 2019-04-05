package Conditional_Statements;

import java.util.Scanner;

public class eligible_to_vote_or_not_using_if_only {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
				
		System.out.println("Enter your age:");
		Double age= sc.nextDouble();
		if (age>18) {
			System.out.println("Eligible to vote.");
		}
		sc.close();
	}

}
