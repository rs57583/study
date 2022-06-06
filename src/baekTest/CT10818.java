package baekTest;

import java.util.Scanner;

public class CT10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int[]n = new int[k];
		
		
		for(int i=0;i<n.length;i++) {
			n[i] = sc.nextInt();
		}
		int max = n[0];
		int min = n[0];
		
		for(int i=0;i<n.length;i++) {
			if(n[i]>max) {
				max = n[i];
			} else if(n[i]<min) {
				min = n[i];
			}
		}
		System.out.println(min + " " + max);
	}
}

