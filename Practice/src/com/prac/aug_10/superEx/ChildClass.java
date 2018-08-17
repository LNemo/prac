package com.prac.aug_10.superEx;

public class ChildClass extends ParentClass {
	
	public ChildClass() {
	// TODO Auto-generated constructor stub
		System.out.println("ChildClass");
		
	}
	
	@Override
	public void method() {
		// TODO Auto-generated method stub
		super.method();
		System.out.println("ChildClass의 method 입니다");
	}
	
}
