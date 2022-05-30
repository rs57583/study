import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, num4;
		
		System.out.print("4개의 수 입력");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();

		int max = num1; 
		int min = num1;

		
		if(num2>max) {
			max = num2;
		}
		if(num2<min) {
			min = num2;
		}
			
		if(num3>max) {
			max = num3;
		} 
		if(num3<min) {
			min = num3;
		}
			
		if(num4>max) {
			max = num4;
		} 
		if(num4<min) {
			min = num4;
		}
		
		System.out.printf("가장 큰 숫자 : %d%n", max);
		System.out.printf("가장 작은 숫자 : %d%n", min);
		
	}
}
