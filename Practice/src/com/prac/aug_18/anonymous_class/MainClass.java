package com.prac.aug_18.anonymous_class;

class Anonymous {
	
	public Anonymous() {
		System.out.println("Anonymous constructor");
	}
	
	public void method() {
		System.out.println("Anonymous class's method");
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		
		new Anonymous() {
			
			@Override
			public void method() {
				System.out.println("Anonymous class's Override method");
			}
		}.method();
		
	}
	
}
