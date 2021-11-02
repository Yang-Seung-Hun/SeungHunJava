package fourteen피자배달거리_삼성역량평가;

import java.util.Scanner;

//뭐래 ~~
//해설 보자
public class Main {
	static int n,m;
	static int[][] board;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,-1,0};
	
	public int DFS(int x, int y, int d) {
		int tmp = 1;
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=1 && nx<=n && ny>=1 && ny<=n && board[nx][ny] !=2) {
				board[nx][ny] = 0;
				DFS(nx,ny,d++);
			}
			else return Math.min(tmp, d);
		}
		return 0;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		board = new int[n+1][n+1];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				board[i][j] = kb.nextInt();
				if(board[i][j] == 1) {
					board[i][j] = 0;
					int a = T.DFS(i,j,0);
					System.out.println(a);
				}
			}
		}

	}

}
