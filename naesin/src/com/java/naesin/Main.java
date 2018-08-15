package com.java.naesin;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과목 수 입력: ");
		int num = sc.nextInt();
		System.out.println("");
		
		double sum = 0;
		double unit_sum = 0;
		double[] grade = new double[num];
		double[] unit = new double[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print((i+1) + " 번째 과목의 점수: ");
			grade[i] = sc.nextInt();
			System.out.print((i+1) + " 번째 과목의 단위: ");
			unit[i] = sc.nextInt();
			System.out.println("");
			
			sum += grade[i] * unit[i];
			unit_sum += unit[i];
		}
		
		System.out.println("내신 평균 등급은 " + sum/unit_sum + " 입니다.");
		
	}
	
}
