package com.prac.aug_01.practice;

import java.util.Scanner;

public class Prac {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int result = i % 2;
		
		switch(result) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		default:
			System.out.println("?");
			break;
		}
		
	}
}
