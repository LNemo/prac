package com.prac.aug_17.singleton_ex;

public class Secondclass {
	public Secondclass() {
		
		Singletonclass singletonclass = Singletonclass.getSingletonclass();
		System.out.println("Secondclass");
		System.out.println("i = " + singletonclass.getI());
		
	}
	
}
