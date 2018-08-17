package com.prac.aug_06.makeclass;

import java.util.Scanner;

public class MakeClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է��ϼ���: ");
		int a = sc.nextInt();
		
		System.out.print("������ ���� �Է��ϼ���: ");
		int l = sc.nextInt();
		
		MakeClass alc = new MakeClass();
		
		System.out.println(a + " ���� " + l + " ���� ������ ���� " + alc.cal(a, l) + " �Դϴ�.");
		
	}
	
	public int cal(int a, int l) {
		
		int result = 0;
		
		for(int i = a; i <= l; i++) {
			result += i;
		}
		
		return result;
	}
}
