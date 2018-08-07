package com.practice;

public class InterfaceMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MakeMyTripTest m= new AirIndia();
		MakeMyTripTest m1= new JetAir();
		

		m.getfair();
		m.getSeat();
		m.getTime();
		
		m1.getfair();
		m1.getSeat();
		m1.getTime();
		
	}

}
