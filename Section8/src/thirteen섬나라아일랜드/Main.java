package thirteen섬나라아일랜드;
//띠바 어려운데 왜케 정답률 높냐
//강의 초반 설명 듣고 풀었음
import java.util.Scanner;

public class Main {
	static int n;
	static int[][] board;
	static int[] dx = {-1,-1,0,1,1,1,0,-1};
	static int[] dy = {0,1,1,1,0,-1,-1,-1};
	static int answer = 0;
	
	public void DFS(int x, int y) {
		
		boolean flag = false;
		
		for(int i=0; i<8; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=1 && nx<=n && ny>=1 && ny<=n && board[nx][ny] == 1) flag = true;
		}
		
		if(!flag) return;
		
		else {
			for(int i=0; i<8; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				if(nx>=1 && nx<=n && ny>=1 && ny<=n && board[nx][ny] == 1) {
					board[nx][ny] = 0;
					DFS(nx,ny);
				}
			}
		}
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
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(board[i][j] == 1) {
					answer++;
					board[i][j] = 0;
					T.DFS(i,j);
				}
			}
		}
		System.out.println(answer);
	}
}
