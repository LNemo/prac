package com.prac.aug_16.itfc;

public class Airplane implements Light, Missile{

	public Airplane() {
		// TODO Auto-generated constructor stub
		System.out.println("비행기");
		canLight();
		canMissile();
		System.out.println("=====================");
	}

	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("미사일을 발사할 수 있습니다.");
		
	}

	@Override
	public void canLight() {
		// TODO Auto-generated method stub
		System.out.println("불빛을 발사할 수 있습니다.");
	}
	
}
