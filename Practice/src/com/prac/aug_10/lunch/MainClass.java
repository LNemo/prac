package com.prac.aug_10.lunch;

public class MainClass {
	
	public static void main(String[] args) {
		
		LunchMenu child1 = new Child1(Price.RICE, Price.BULGOGI, Price.BANANA, Price.MILK, Price.ALMOND);
		LunchMenu child2 = new Child2(Price.RICE, Price.BULGOGI, Price.BANANA, Price.MILK, Price.ALMOND);
		
		System.out.println(child1.cal());
		System.out.println(child2.cal());
		
	}

}
