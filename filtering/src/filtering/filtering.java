package filtering;

import java.util.Scanner;

public class filtering {
	static public void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int data_n = 2;
		int user_n = 0;
		int check, user_num = 0;
		String input, nickname;
		String[] str_data = new String[100];
		str_data[0] = "씨발";
		str_data[1] = "병신";
		
		String[] user = new String[100];
		int[] report_count = new int[100]; 
		
		
		while(true) {
			System.out.println("<현재 등록된 데이터>");
			for(int i = 0; i < data_n; i++) {
				System.out.print(str_data[i] + " ");
			}
			System.out.println("\n");
			System.out.print("닉네임을 입력하세요 >> ");
			nickname = sc.nextLine();
			
			for(int i = 0; i < user_n; i++) {
				user_num = i;
				if(user[i].equals(nickname)) {
					break;
				}
				if(i == user_n-1) {
					user[user_n] = nickname;
					report_count[user_n] = 0;
					user_n++;
				}
			}
			if(user[user_n] == null && user_n == 0) {
				user[user_n] = nickname;
				report_count[user_n] = 0; 
				user_n++;
			}
			
			System.out.println("현재 접속중: " + nickname + " (user_num: " + user_num + ", 신고 횟수: " + report_count[user_num] + ")");
			System.out.println("");
			
			System.out.print(">> ");
			input = sc.nextLine();
			
			for(int i=0;i<data_n;i++) {
				if(input.equals(str_data[i])) {
					report_count[user_num]++;
					System.out.println("[" + nickname + "] " + "삐약삐약");
					break;
				}
				if(i == data_n-1) {
					System.out.println("[" + nickname + "] " + input);
					System.out.println("");
					System.out.print("report/pass (1/0) >> ");
					check = sc.nextInt();
			
					if(check == 1) {
						str_data[data_n] = input;
						report_count[user_num]++;
						data_n++;
						
					}
					break;
				}
			}
			System.out.println("--------------------------------------");
		}
		
	}
}
