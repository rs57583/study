import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "";
		int kor, eng, mat;
		
		System.out.print("이름은?");
		name = sc.next();
		System.out.print("3과목 성적을 입력");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		int sum = kor+eng+mat;
		double avg = sum/3.0;
		String str = "";
		
		if(sum>=40 && avg>=60) {
			str = "합격";
		}
		if((kor<40 || eng<40 || mat<40) && avg >= 60) {
			str = "과락";
		}
		if(avg < 60) {
			str = "불합격";				
		}
		
		System.out.println("이름 : " + name + ", 합격여부 : " + str);
	
		}
}


