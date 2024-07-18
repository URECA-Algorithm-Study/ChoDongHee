import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] field = new int[100][100];
		
		int N = sc.nextInt();
		
		int[] memoX = new int[N];
		int[] memoY = new int[N];
		
		int x, y;
		int rs = 0;
				
		for (int i = 0; i < N; i++) {
			x = sc.nextInt() - 1;
			y = sc.nextInt() - 1;
			
			memoX[i] = x;
			memoY[i] = y;
			
			for (int j = y; j < y+10; j++) {
				for (int k = x; k < x+10; k++) {
					field[j][k] = 1;
				}
			}
		}
		 
		int maxX = Arrays.stream(memoX).max().getAsInt() + 10;		
		int minX = Arrays.stream(memoX).min().getAsInt();
		int maxY = Arrays.stream(memoY).max().getAsInt() + 10;
		int minY = Arrays.stream(memoY).min().getAsInt();
		
		for (int i = minY; i < maxY; i++) {
			for(int j=minX; j<maxX; j++) {
				if(field[i][j] == 1)
					rs += 1;
			}
		}
		
		System.out.println(rs);
	}
	
}