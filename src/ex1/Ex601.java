package ex1;
// 메소드는 반환값이 있고 반환타입도 있다
// 생성자는 iv초기화(저장)하는 역할!
public class Ex601 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
	
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}
	
class SutdaCard{
	int num;
	boolean isKwang; // 여기까지 iv
	
	SutdaCard(){ // 생성자
		this(1, true); // this()는 생성자 호출
	}
	SutdaCard(int num, boolean isKwang){
		this.num = num; // this.iv는 클래스의 iv에 저장
		this.isKwang = isKwang;
	}		
	String info() { // 메소드. 반환값이 존재. 타입은 String
		return num+(isKwang ? "k" : "");
	}
}
// 3 아무것도 출력 안됨("")라서
// 1k
