package Conditional_Statements;

import java.util.Scanner;

public class grades {
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your grade:");
	    Double marks= sc.nextDouble();
	    if (marks < 50)
	    {
	    	System.out.println("You have to take the course.");
	    }
	    else if (marks>=50 && marks<=60) {
	    	System.out.println("You are retake the exam.");
	    }
	    else if (marks>60 && marks <=70) {
	    	System.out.println("You have got average marks.");
	    }
	    else if (marks>70 && marks <=80) {
	    	System.out.println("You have are good,");
	    }
	    else if(marks>80 && marks <=90) {
	    	System.out.println("You are very good.");
	    }
	    else if (marks> 90 && marks <= 100){
	    	System.out.println("You are excellent.");
	    }
	

	sc.close();
	}

}
