package com.prac.aug_17.singleton_ex;

//싱글톤 핵심부

public class Singletonclass {

	private static Singletonclass SINGLETON_CLASS_INSTANCE = null;
	public int i = 10;
	
	private Singletonclass() {}	//생성자를 막아둠
	
	public static Singletonclass getSingletonclass() {
		
		if(SINGLETON_CLASS_INSTANCE == null) {
			SINGLETON_CLASS_INSTANCE = new Singletonclass();
		}
		
		return SINGLETON_CLASS_INSTANCE;
	}
	
	public int getI() {
		return i;
	}
	
	public void setI(int i) {
		this.i = i;
	}
	
}
