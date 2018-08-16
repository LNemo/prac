package com.prac.aug_17.singleton_ex;

public class Firstclass {
	public Firstclass() {
		
		Singletonclass singletonclass = Singletonclass.getSingletonclass();
		System.out.println("Firstclass");
		System.out.println("i = " + singletonclass.getI());
		singletonclass.setI(200);
		System.out.println("i = " + singletonclass.getI());
		
	}
	
}
