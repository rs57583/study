package ex06;

public class Ex605 {
	public static void main(String[] args) {
		Student3 s = new Student3("홍길동", 1, 1, 100, 60, 76);
		System.out.println(s.info());

	}
}
class Student3{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	Student3(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math; // 100+60+76
	}
	float getAverage() {
		float result = (kor + eng + math)/3f;
		return Math.round(result*10)/10f; // 786.666/10f
	}
	
	String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","
				+getTotal()+","+getAverage();
	}
	
}
