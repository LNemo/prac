package com.prac.aug_17.reference;

interface Itfc1 {
	
}
interface Itfc2 {
	
}
interface Itfc3 extends Itfc1, Itfc2 {		//인터페이스는 상속 2개이상 가능
	
}

class Super {
	
}

class Object extends Super {				//클래스는 불가능
	
}

public class MainClass extends Super{

	public static void main(String[] args) {
		
		Super mainclass1 = new MainClass();		//객체 생성
		Super mainclass2 = new MainClass();
		Super object1 = new Object();
		Super object2 = new Object();
		
		System.out.println("mainclass ==> " + mainclass1);	//주소값 출력
		System.out.println("mainclass ==> " + mainclass2);
		System.out.println("object ==> " + object1);
		System.out.println("object ==> " + object2);
		
	}
	
}	
