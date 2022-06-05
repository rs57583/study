
public class Array1 {

	public static void main(String[] args) {
		int[][]score = { // score.length는 행의 길이라서 5, 그리고 각 열의 길이가 동일하니 score[i]는 3으로 동일.
				{100, 100, 100}, 
				{20, 20, 20}, 
				{30, 30, 30}, 
				{40, 40, 40}, 
				{50, 50, 50}};
		int total = 0;
		float avg = 0.0f;
		System.out.println("번호  국어  영어    수학  총점  평균");
		System.out.println("=====================================");
		
		for(int i=0;i<score.length;i++) {
			System.out.printf("%3d", i+1);
			for(int j=0;j<score[i].length;j++) {
				total += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			System.out.printf("%5d", total);
			avg = (float)total/score[i].length;
			System.out.printf("%5.1f", avg);
			
			System.out.println();
		}
	
	}
}
