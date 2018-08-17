package com.prac.aug_18.bored;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 1;
		String str;
		
		while(n == 1) {
			
			System.out.print("대머리는 (사회악 / 무죄) (이)다.: ");
			str = sc.nextLine();
			
			if(str.equals("사회악")) {
				System.out.println("대머리는 사회악이다!");
				n = 0;
			}else if(str.equals("무죄")) {
				System.out.println("당신, 탈모시군요?");
				n = 0;
			}else {
				System.out.println("주어진 단어를 입력하셔야죠?");
				System.out.println("");
			}
			
		}
		sc.close();
	}
	
}
