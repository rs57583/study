package baekTest;

import java.util.Scanner;

public class CT8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.next();
		}
		
		for(int i=0;i<arr.length;i++) {
			
			int time = 0; //횟수
			int sum = 0;
			
			for(int j=0;j<arr[i].length();j++) {
				if(arr[i].charAt(j) == 'O') {
					time++;
				} else {
					time = 0; // 초기화
				}
				sum += time;
			}
			System.out.println(sum);
		}
	}

}
//조금만 더 생각했으면 충분히 혼자 풀 수 있었음
