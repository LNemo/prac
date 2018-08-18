package com.prac.aug_18.lambda;

public class MainClass {

	public static void main(String[] args) {
		
		LambdaItfc1 ld1 = (String s1, String s2, String s3) -> {System.out.println(s1 + " " + s2 + " " + s3);};
		ld1.method("Hello", "Java", "World");
		
		LambdaItfc2 ld2 = (s1) -> {System.out.println(s1);};
		ld2.method("Hello");
		
		LambdaItfc2 ld3 = s1 -> System.out.println(s1);
		ld3.method("Hello");
		
		LambdaItfc3 ld4 = () -> System.out.println("No parameter");
		ld4.method();
		
		LambdaItfc4 ld5 = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println("ld5.method(10, 20): " + ld5.method(10, 20));
		
		ld5 = (x, y) -> {
			int result = x * y;
			return result;
		};
		System.out.println("ld5.method(10, 20): " + ld5.method(10, 20));
		
		ld5 = (x, y) -> {
			int result = x - y;
			return result;
		};
		System.out.println("ld5.method(10, 20): " + ld5.method(10, 20));
	}
	
}
