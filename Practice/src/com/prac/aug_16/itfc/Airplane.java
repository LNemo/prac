package com.prac.aug_16.itfc;

public class Airplane implements Light, Missile{

	public Airplane() {
		// TODO Auto-generated constructor stub
		System.out.println("�����");
		canLight();
		canMissile();
		System.out.println("=====================");
	}

	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("�̻����� �߻��� �� �ֽ��ϴ�.");
		
	}

	@Override
	public void canLight() {
		// TODO Auto-generated method stub
		System.out.println("�Һ��� �߻��� �� �ֽ��ϴ�.");
	}
	
}
