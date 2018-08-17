package com.prac.aug_02.practice;

import java.util.Scanner;

public class Prac {
	public static void main(String[] args) {
		
		int[] arr1 = new int[5];
		int[] arr2 = arr1;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < arr1.length; i++) {
			
			System.out.print("arr1[" + i + "] ��: ");
			arr1[i] = scanner.nextInt();
			
		}
		
		for(int i = 0; i < arr1.length; i++) {
			
			System.out.println("arr1[" + i + "] ��: " + arr1[i]);
			System.out.println("arr2[" + i + "] ��: " + arr2[i]);
			
		}
		
	}
}