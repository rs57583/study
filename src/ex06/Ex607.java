package ex06;
// 스태틱메소드에서는 인스턴스변수를 사용할 수 없다
class MyPoint{
	int x;
	int y;
	
	MyPoint(){this(5,5);}
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
//	앞에 static이 붙으면 x,y를 사용못해! 인스턴스 변수는 객체 생성없이 접근이 안되거든
//	지금 메소드는 인스턴스 메소드!!
	double getDistance(int x1, int y1) { // 이 매개변수는 지역변수!!
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
//		return Math.sqrt(Math.pow(x-x1,2) + Math.pow(y-y1,2));
	}
}

public class Ex607 {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(1,1);
		
		System.out.println(p2.getDistance(2,2));
		System.out.println(p1.getDistance(2,2));
	}
}
		

