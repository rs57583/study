package ex06;

public class Ex603 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동"; 
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름 :"+s.name); 
		System.out.println("총점 :"+s.getTotal()); 
		System.out.println("평균 :"+s.getAverage());
	}
}
class Student {
	String name;
	int ban;
	int no;
	int kor, eng, math;

	int getTotal() {
		return kor + eng + math; // 100+60+76     236
	}
	float getAverage() { // 둘다 가능
//		float result = (kor + eng + math)/3f;
//		return Math.round(result*10)/10f; // 786.666/10f
		return (int)(getTotal()/3f *10 +0.5f) /10f;
	}
}
