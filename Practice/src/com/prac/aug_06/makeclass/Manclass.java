package com.prac.aug_06.makeclass;

public class Manclass {
	
	private int a;
	
	public Manclass() {
		System.out.println("�ȳ� �ȳ�");
	}
	
	public Manclass(int a) {
		System.out.println("asdf");
	}
	
	public int cal(int a, int l) {
		int result = 0;
		
		for(int i = a; i <= l; i++) {
			result += i;
		}
		
		return result;
	}
	
}
