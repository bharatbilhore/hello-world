package com.practice;

public interface MakeMyTripTest {
	
	void getSeat();
	void getfair();
	void getTime();
}

 class AirIndia implements MakeMyTripTest{

	@Override
	public void getSeat() {
		System.out.println("This is Air India Seat method");
	}

	@Override
	public void getfair() {
		// TODO Auto-generated method stub
		System.out.println("This is Air India ]get fair");
	}

	@Override
	public void getTime() {
		System.out.println("This is Air India Gettime");	
	}
}
 class JetAir implements MakeMyTripTest{

	@Override
	public void getSeat() {
		// TODO Auto-generated method stub
		System.out.println("This is jetAir get Seat method");
	}

	@Override
	public void getfair() {
		// TODO Auto-generated method stub
		System.out.println("This is jetAir get fair method");
	}

	@Override
	public void getTime() {
		// TODO Auto-generated method stub
		System.out.println("This is jetAir get time method");
	}
	 
 }
