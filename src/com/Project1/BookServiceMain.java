package com.Project1;

import java.util.Scanner;

public class BookServiceMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Thread th = new BookServiceImpl();

		BookService bs = new BookServiceImpl();

		int ch;

		while (true) {

			do {
				System.out.println("===========================");
				System.out.println("    [도서 대출 시스템]   ");
				System.out.println("===========================");
				System.out.print("1.회원 정보 등록 \n2.도서 대출 \n3.대출 가능여부 조회 \n4.전체 대출 정보 열람 \n5.회원 검색 " + "\n6.반납하기 "
						+ "\n7.도서 추천  \n8.종료");
				System.out.print("\n===========================\n");
				System.out.print(": ");

				ch = sc.nextInt();
			} while (ch < 1);

			switch (ch) {
			case 1:
				bs.input();
				break; // 회원 정보
			case 2:
				bs.select();
				break; // 대출

			case 3:
				bs.searchBook();
				break; // 대출 가능여부 확인
			case 4:
				bs.print();
				;
				break; // 대출 정보 보기

			case 5:
				bs.findTel();
				break; // 번호로 회원 검색
			case 6:
				bs.delete();
				break; // 반납하기

			case 7:
				bs.recommend();
				break; // 도서 추천
				
			default:
				System.out.println("도서 대출 시스템을 종료합니다.");
				System.exit(0);
			}
			System.out.println();
		}

	}

}
