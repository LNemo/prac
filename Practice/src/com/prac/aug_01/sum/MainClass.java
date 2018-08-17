package com.prac.aug_01.sum;

public class MainClass {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
			}
			System.out.print("\n");
		}
		
	}
}
