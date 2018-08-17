package com.prac.aug_10.itfc;

public class MainClass {

	public static void main(String[] args) {
		
		IFunction aPhone = new APhone();
		IFunction bPhone = new BPhone();
		IFunction cPhone = new CPhone();
		
		IFunction[] phones = {aPhone, bPhone, cPhone};
		
		for(int i = 0; i < 3; i++) {	
			phones[i].call();
			phones[i].lte();
			phones[i].tvRemomte();
			System.out.println("=============================");
		}
		
	}
	
}
