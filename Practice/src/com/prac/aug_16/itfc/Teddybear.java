package com.prac.aug_16.itfc;

public class Teddybear implements MoveArmLeg {

	public Teddybear() {
		// TODO Auto-generated constructor stub
		System.out.println("곰인형");
		canMoveArmLeg();
		System.out.println("=====================");
	}
	
	@Override
	public void canMoveArmLeg() {
		// TODO Auto-generated method stub
		System.out.println("팔, 다리를 움직일 수 있습니다.");
	}

}
