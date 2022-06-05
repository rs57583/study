package ex1;
// 611의 다른 풀이 이게 더 간단할지도
public class Ex5112 {
	public static void main(String[] args) {

		int[][]score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		
		// 합계를 적을 수 있는 새로운 배열 생성 행과 열이 하나씩만 더 있으면 됨
		int[][] result = new int[score.length+1][score[0].length+1];
		for(int i=0; i < score.length;i++) { // 0~4
			for(int j=0; j < score[i].length;j++) { // 0~2
				
				result[i][3] += score[i][j];
				result[5][j] += score[i][j];
				result[5][3] += score[i][j];
				result[i][j] += score[i][j];
			}
		}
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.printf("%4d",result[i][j]);
			}
			System.out.println();
		}

	}
}		
