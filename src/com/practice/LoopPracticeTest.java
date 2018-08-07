package com.practice;

public class LoopPracticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int j=1; j<=3; j++)
		{
			for (int i=3; i>j; i--){
				System.out.print(" ");	
			}
			
			for (int i=1; i<=3; i++){
				if(i <= j)
					System.out.print(i);	
			}
			System.out.println();
		}
			
	}

}
	