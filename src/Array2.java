import java.util.*; // Arrays.toString은 import문이 필요하다!
public class Array2 {
// 불연속적인 숫자로 이루어진 길이 5의 배열을 길이 10의 배열에서 나열해보기. 중복이 생기고 복사할때랑 비슷한듯? 
	public static void main(String[] args) {
		int[]code = {-4, -1, 3, 6, 1}; // 개수는 5개
		int[]arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			int tmp = (int)(Math.random()*5); // 0~4
			arr[i] = code[tmp];
		}
		
		System.out.println(Arrays.toString(arr)); // random메소드를 사용해서 결과는 계속 달라짐
		
		
	}
}
