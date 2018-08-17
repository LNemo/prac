package com.prac.aug_10.staticEx.sttc;


import com.prac.aug_10.staticEx.children.*;

public class Mainclass {
	public static void main(String[] args) {
		
		First first = new First();
		first.takeMoney(100);
		
		Second second = new Second();
		second.takeMoney(100);
		
		Third third = new Third();
		third.takeMoney(100);
		
	}
}
