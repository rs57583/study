
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