package ten¹Ì·ÎÅ½»ö_DFS;
//¾Æ¸ô¶û
import java.util.Scanner;

public class Main {
	static int[][] arr = new int[9][9];
	static int[] dx = {};
	static int[] dy = {-1, 1};
	static int x = 1;
	static int y = 1;
	static int answer = 0;
	
	public void DFS() {
		
		if(x == 7 && y == 7) {
			answer++;
		}
		
		else {
			
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		for(int i=0; i<9; i++) {//°¡ÀåÀÚ¸®
			arr[0][i] = 2;
			arr[i][0] = 2;
			arr[8][i] = 2;
			arr[i][8] = 2;
		}
		
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<9; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
	}
}
