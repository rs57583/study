package baekTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//map 쓰는 문제래..ㅎ

public class CT10816 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		List list1 = new ArrayList<>();
		List list2 = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			list1.add(sc.nextInt());
		}
		int M = sc.nextInt();

		for (int i = 0; i < M; i++) {
			list2.add(sc.nextInt());
		}
		
		int[] arr = new int[M];
		for(int i=0;i<M;i++) {
			arr[i] = 0;
		}
		
		
		for (int j = 0; j < M; j++) {
			for (int i = 0; i < N; i++) {
				
				if (list2.get(j) == list1.get(i)) {
					++arr[j];
				}
			}
		}

		for(int i=0;i<M;i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
}
