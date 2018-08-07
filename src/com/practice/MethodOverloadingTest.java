package com.practice;

import java.util.Scanner;

public class MethodOverloadingTest {
	
	
	static int Add1(int a, int b){
		int d1=a+b;
		return d1;
		
	}
	static int Add1(int a, int b,  int c){
		int d= a+b+c;
		return d;
		
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a  number: ");
	    int number = scanner.nextInt();
		
	    switch(number){ 
	    
	    case 1: {
	    	System.out.println("******addition of two number****");
	    
	          System.out.print("Enter a  number: ");
	          int number1 = scanner.nextInt();
	          System.out.print("Enter another number: ");
	          int number2 = scanner.nextInt();
	    
	         int A1= Add1(number1, number2);
	    
	         System.out.println("addition of two number is"+A1);
	    	
	    };break; 
	    
	    case 2: {
	                 System.out.println("******addition of three number****");
    
                    System.out.print("Enter a number: ");
                    int number3 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int number4 = scanner.nextInt();
                    System.out.print("Enter third number: ");
                   int number5 = scanner.nextInt();
                   int A2= Add1(number3, number4,number5);

                  System.out.println("addition of two number is"+A2);	    	
	    	
	   
	 }break; 
	    default:System.out.println("invalid");  
		
	
	    int number1 = scanner.nextInt();
	    
	    System.out.println("---number"+ number1);
	       
	}
  }

}



