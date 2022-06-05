package ex1;
// 문자열의 비교는 .equals()
import java.util.Scanner;

public class Ex512 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String []s1 = new String[3];
		String []s2 = {"chair", "computer", "integer"};
		String []s3 = {"의자", "컴퓨터", "정수"};

		int n =0;
		
		for(int i=0;i<s1.length;i++) {
			n++;
			
			System.out.print("Q"+n+". "+s2[i]+"의 뜻은? ");
			s1[i] = sc.nextLine();
			
			if(s1[i].equals(s3[i])) {
				System.out.println("정답입니다");
			} else {
				System.out.println("틀렸습니다. 정답은 "+s3[i]+"입니다");
			}
		}
		sc.close();
	}
}
