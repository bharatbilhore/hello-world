package com.practice;

import java.util.Scanner;

public class MethodOverriddingTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RBIRoi_Test RBIpbj= new RBIRoi_Test();
		SBIROI_Test SBIROI =new SBIROI_Test();
		
		float total= RBIpbj.ROI(10, 2);
	   
	    System.out.println("RBI rate of interest is" + total);
	    
	    float total1= SBIROI.ROI(10,2);
	   
	    
	    
	}
}


