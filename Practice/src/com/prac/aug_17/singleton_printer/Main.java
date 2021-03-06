package com.prac.aug_17.singleton_printer;

//싱글톤 패턴을 사용한 프린터 예제

class User{
	private String name;
	
	public  User(String name) {
		this.name = name;
	}
	
	public void print() {
		Printer printer = Printer.getPrinter();
		printer.print(this.name + " print using " + printer.toString() + ".");	//toString() 이 뭐지
	}
}

class Printer{
	private static Printer printer = null;
	private Printer() {
		
	}
	
	public static Printer getPrinter() {
		if(printer == null) {
			printer = new Printer();
		}
		return printer;
	}
	
	public void print(String str) {
		System.out.println(str);
	}
}


public class Main {
	private static final int  User_NUM = 5;
	public static void main (String[] args) {
		User[] user = new User[User_NUM];
		for(int i = 0; i < User_NUM; i++) {
			user[i] = new User((i+1) + "-User");
			user[i].print(); 
		}
	}
}
