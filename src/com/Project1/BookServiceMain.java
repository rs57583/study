package com.Project1;

import java.util.Scanner;

public class BookServiceMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		BookServiceImpl bs = new BookServiceImpl();

		int ch;
		while (true) {

			do {
				System.out.println("┎-----------------------------┓");
				System.out.println("┃     [도서 대출 시스템]      ┃");
				System.out.println("┞-----------------------------┩");
				System.out.print("┃1.회원 정보 등록             ┃ \n┃2.전체 회원                  ┃\n┃3.대출하기                   ┃\n┃4.도서 추천                  ┃" + "\n┃5.반납하기                   ┃"
						+ "\n┃6.회원 검색                  ┃ \n┃7.종료                       ┃");
				System.out.print("\n┗-----------------------------┚\n");
				System.out.print(": ");
				ch = sc.nextInt();

				
			} while (ch < 1);

			switch (ch) {
			case 1: bs.input(); break;
			case 2: bs.print(); break;
			case 3: bs.loan(); break;
			case 4: 
				bs.recommend1();
				bs.start();
				try {
					bs.join();
				} catch (Exception e) {
					// TODO: handle exception }
				}
				bs.recommend2();
				break;
			case 5: bs.delete(); break;
			case 6: bs.findTel(); break;
			
			default:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}

	}
}

