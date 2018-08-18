package com.prac.aug_18.student;

class Student {
	
	public static int NINE = 9;
	private int stu_NUM;
	private String name;
	private int score;
	
	public Student (int stu_NUM, String name, int score) {
		this.stu_NUM = stu_NUM;
		this.name = name;
		this.score = score;
		
		System.out.println("학번: " + stu_NUM);
		System.out.println("이름: " + name);
		System.out.println("점수: " + score);
		System.out.println("학생 정보가 입력되었습니다.");
		System.out.println("=========================");
	}
	
	public void getInfo() {
		System.out.println("학번: " + stu_NUM);
		System.out.println("이름: " + name);
		System.out.println("점수: " + score);
	}
	
	public int getNUM() {
		return stu_NUM;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		if(score > this.score) this.score = score;
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		
		Student stu1 = new Student(10101, "홍길동", 60);
		
		
		
	}
	
}
