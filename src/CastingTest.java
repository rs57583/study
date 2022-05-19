// 다형성의 기본개념, 참조변수의 형변환 이해하는 예제 
public class CastingTest {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		fe.water();
		car = fe; // 형변환 생략 가능
//		car.water(); 이건 불가능하다. 왜냐면 소방차 객체에 car참조변수가 다룰 수 없는 water메소드가 있으니까
		FireEngine fe2 = (FireEngine)car;
		fe2.water();
		car.color = "white";
		System.out.println(car.color);
	}
}

class Car {
	String color;
	int door;
	void drive() { 
		System.out.println("drive, Brrrr~~~"); }
	void stop () {
		System.out.println("stop!!!");
	}
}
class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
	
}