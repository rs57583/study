package com.Project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookServiceImpl extends Thread implements BookService {
	Scanner sc = new Scanner(System.in);

	private List<BookServiceVO> lists = new ArrayList();

	public String[] novel = { "[내가 틀릴 수도 있습니다] 저자.비욘 나티코", "[마음의 법칙] 저자.폴커 키츠", "[어른의 문해력] 저자.김선영",
			"[무엇이 옳은가] 저자.후안 엔리케스", "[사피엔스] 저자.유발 하라리" }; // 인문 
	public String[] science = {"과학1", "과학2", "과학3", "과학4", "과학5"};
	public String[] art = {"예술1", "예술2", "예술3", "예술4", "예술5"};
	public String[] lang = {"언어1", "언어2", "언어3", "언어4", "언어5"};
	
	List<String[]> bookrec = new ArrayList<String[]>();
	public void bookarr() {
		bookrec.add(novel);
		bookrec.add(science);
		bookrec.add(art);
		bookrec.add(lang);
	}
	
	
	
	@Override
	public void input() {

		BookServiceVO vo = new BookServiceVO();

		System.out.print("핸드폰 마지막 4자리를 입력해주세요");
		vo.setTel(sc.next());

		System.out.print("이름을 입력해주세요. ");
		vo.setName(sc.next());

		System.out.print("학년을 입력해주세요");
		vo.setGrade(sc.nextInt());

		lists.add(vo);

		System.out.println("회원정보가 등록되었습니다.");
	}

	public boolean checkTel() {

		return true;
	}

	@Override
	public boolean searchBook() {
		return false;
	}

	@Override
	public void print() {
	}

	@Override
	public void select() {
	}

	@Override
	public void recommend() {
		System.out.println("관심있는 분야의 번호를 선택해주세요");
		System.out.print("\n  1.소설   |  2.과학   |  3.예술   |  4.어학 ");
		int genre = sc.nextInt();
		System.out.println();
		
		String[] result = new String[2]; // 추천도서 2개 담을 배열
		bookarr();
		
		System.out.println();
		System.out.println("\n추천 도서 목록입니다.\n");

		for (int i = 0; i < result.length; i++) {
			int x = (int) (Math.random() * 5);

			result[i] = (bookrec.get(genre-1))[x];

			for (int j = 0; j < i; j++) {
				if (result[i] == result[j]) {
					i--;
					break;
				}
			}
		}

		for (int k = 0; k < 2; k++) {
			System.out.println((k + 1) + ". " + result[k]);
		}
	}

	@Override
	public void delete() {
	}

	@Override
	public void findTel() {
	}

//	@Override
//	public void run() {
//		for (int i = 1; i <= 10; i++) {
//			System.out.print(".");
//			try {
//				Thread.sleep(300);
//			} catch (Exception e) {
//
//			}
//		}
//	}

	
	
}
