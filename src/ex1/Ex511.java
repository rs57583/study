package ex1;

public class Ex511 {
	public static void main(String[] args) {

		int[][]n = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		int x=0, x3=0;
		int y=0, y2=0, y3=0;
		for(int i=0;i<5;i++) {
			x = 0; 
			
			for(int j=0;j<3;j++) {
				System.out.printf("%5d", n[i][j]);
				x += n[i][j];
				x3 += n[i][j];
			}
			System.out.printf("%5d", x);
			System.out.println();
			
			y += n[i][0];
			y2 += n[i][1];
			y3 += n[i][2];
		}
		System.out.printf("%5d%5d%5d%5d", y, y2, y3, x3);		
	}
}		
