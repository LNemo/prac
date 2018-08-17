package com.prac.aug_17.reference;

class Super {
	
}

class Object extends Super {
	
}

public class MainClass extends Super{

	public static void main(String[] args) {
		
		Super mainclass1 = new MainClass();
		Super mainclass2 = new MainClass();
		Super object1 = new Object();
		Super object2 = new Object();
		
		System.out.println("mainclass ==> " + mainclass1);
		System.out.println("mainclass ==> " + mainclass2);
		System.out.println("object ==> " + object1);
		System.out.println("object ==> " + object2);
		
	}
	
}
