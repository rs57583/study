
public class Array3 {
// charAt()메소드 이용해서 각자리에 해당하는 문자 출력하기
	public static void main(String[] args) {
		String str = "ABCDE";
		
		for(int i=0;i<5;i++) {
			char ch = str.charAt(i); // charAt()메소드는 문자열의 특정 자리의 문자 하나를 출력해줌.
			System.out.println("src.charAt("+i+"):"+ch);
		}
		System.out.println(str);
		
		
	}

}
