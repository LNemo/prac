package com.prac.aug_16.itfc;

public class Robot implements MoveArmLeg, Missile {

	public Robot() {
		// TODO Auto-generated constructor stub
		System.out.println("로봇");
		canMissile();
		canMoveArmLeg();
		System.out.println("=====================");
	}

	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("미사일을 발사할 수 있습니다.");
	}

	@Override
	public void canMoveArmLeg() {
		// TODO Auto-generated method stub
		System.out.println("팔, 다리를 움직일 수 있습니다.");
		
	}
	
}
