package com.prac.aug_16.itfc;

public class Robot implements MoveArmLeg, Missile {

	public Robot() {
		// TODO Auto-generated constructor stub
		System.out.println("�κ�");
		canMissile();
		canMoveArmLeg();
		System.out.println("=====================");
	}

	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("�̻����� �߻��� �� �ֽ��ϴ�.");
	}

	@Override
	public void canMoveArmLeg() {
		// TODO Auto-generated method stub
		System.out.println("��, �ٸ��� ������ �� �ֽ��ϴ�.");
		
	}
	
}
