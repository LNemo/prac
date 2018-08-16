package com.prac.aug_16.anonymous_test;

public class Main {

	public static void main(String[] args) {
		
		Abstract ab = new Abstract() {
			
			@Override
			public void Ab_method() {
				
				// *추상클래스를 배로 쓰기 때문에" 이곳에서구현을 해줘야 함
				
			}
		};
		
		Interface it = new Interface() {
			
			@Override
			public void In_method() {
				
				// *인터페이스를 바로 쓰기 때문에* 이곳에서 구현을 해줘야 함
				
			}
		};
		
		ab.Ab_method(); // anonymous class 사용
		it.In_method(); // anonymous class 사용
		
	}
	
}
