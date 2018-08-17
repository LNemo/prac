package com.prac.aug_10.lunch;

public abstract class LunchMenu {

	int rice;
	int bulgogi;
	
	int banana;
	int milk;
	int almond;
	
	public LunchMenu(int rice, int bulgogi, int banana, int milk, int almond) {
		// TODO Auto-generated constructor stub
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.banana = banana;
		this.milk = milk;
		this.almond = almond;
	}
	
	public abstract int cal();
	
}
