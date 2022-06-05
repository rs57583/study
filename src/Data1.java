// 상속-포함관계 : 자손클래스에 조상클래스 객체를 생성하면 포함관계가 된다.
// 다중상속이 안되기 때문에 하나는 상속, 하나는 포함관계를 이용해서 2개의 클래스를 모두 이용하는 것
// 자바에서 다중상속은 불가능하지만 욕먹기 싫어서 자바도 가능한걸 보여주기 위해서 뒤에 다형성의 인터페이스를 통해 다중상속이 가능하기도 하지만 거의 안씀
class Point {
	int x;
	int y;
	
}
//class Circle extends Point {
//	int r;
//}
class Circle { // 포함관계
	Point p = new Point();
	int r;
}

class Data1 {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x = 1; // 왜 이렇게 되는지 그림그린거 기억해보기
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.p.x="+c.p.x);
		System.out.println("c.p.y="+c.p.y);
		System.out.println("c.r="+c.r);
	}
}