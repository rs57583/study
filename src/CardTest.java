
class CardTest {
	public static void main(String[] args) {
		Card.width = 200;
		Card.height = 300; // cv는 객체생성 없이 사용 가능 (new연산자로 객체생성함)
		// 변경된 값은 모든 객체에 적용된다. (클래스변수는 공통적으로)
		Card c1 = new Card();
		c1.kind = "heart";
		c1.number = 8;
		Card c3 = new Card();
		c3.kind = "Spade";
		c3.number = 7;
		System.out.println("c1은 "+c1.kind+","+c1.number+"이며, 크기는 ("+Card.width+","+Card.height+")"+"입니다.");
	
	}
	

}
class Card {
	int number;
	String kind; // number와 kind는 iv
	static int width = 100;
	static int height = 250; // static이 붙은 애들이 cv
}
