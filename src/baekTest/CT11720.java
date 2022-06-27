package baekTest;
// 숫자의 합
import java.util.Scanner;

public class CT11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String a = sc.next();
		sc.close();
		
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			sum += a.charAt(i)-'0'; 
		}
		System.out.println(sum);
	}
}
// n=3, a=256이면 i는 0,1,2 
// charAt 0,1,2가 들어갈때마다 2,5,6이 반환되며 그값이 sum에 누적되어 저장
// a가 256789여도 n이 3이면 위와 같은값
// n은 a의 자리수를 의미
