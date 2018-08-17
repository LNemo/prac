package com.prac.aug_10.staticEx.children;

import com.prac.aug_10.staticEx.wallet.Wallet;

public class Second {

	public void takeMoney(int money) {
		
		Wallet.MONEY -= money;
		if(Wallet.MONEY < 0) System.out.println("��° �� x");
		
	}
	
}
