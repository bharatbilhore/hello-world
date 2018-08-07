package com.practice;

public abstract class Maruti {
	
	Void GetEngine(){
		System.out.println("Engine is 800 CC");
		return null;			
	}
	
	public abstract void Getcolor();
	public abstract void GetengineType();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maruti obj1 =new CelerioCar();
		Maruti obj2 =new AltoCar();
		
		obj1.GetEngine();
		obj1.Getcolor();
		obj1.GetengineType();
		
		
		obj2.GetEngine();
		obj2.GetengineType();
		obj2.Getcolor();

	}

}
