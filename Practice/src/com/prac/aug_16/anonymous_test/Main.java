package com.prac.aug_16.anonymous_test;

public class Main {

	public static void main(String[] args) {
		
		Abstract ab = new Abstract() {
			
			@Override
			public void Ab_method() {
				
				// *�߻�Ŭ������ �ٷ� ���� ������* �̰����� ������ �������
				
			}
		};
		
		Interface it = new Interface() {
			
			@Override
			public void In_method() {
				
				// *�������̽��� �ٷ� ���� ������* �̰����� ������ �������
				
			}
		};
		
		ab.Ab_method(); // anonymous class ���
		it.In_method(); // anonymous class ���
		
	}
	
}
