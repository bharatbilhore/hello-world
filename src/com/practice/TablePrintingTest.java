package com.practice;

import java.util.Scanner;

public class TablePrintingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a  number: ");
	    int number = scanner.nextInt();
	    
	    System.out.println("---number"+ number);
	    
	    for (int i=1;i<=10;i++)
	    {
	    	 int c= i*number;
	    	System.out.println(c);
	    }
	    
	}

}
