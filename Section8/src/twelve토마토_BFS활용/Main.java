package twelve토마토_BFS활용;
//접근 좋았음 다시 한번 차근히 풀어보자 ㅅㅂ
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Main {
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static int m,n;
	static int[][] board;
	
	public boolean isAllRipen() {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(board[i][j] == 0) return false;
			}
		}
		return true;
	}
	
	public int BFS() {
		Queue<Point> Q = new LinkedList<>();
		int L = 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(board[i][j] == 1) Q.offer(new Point(i,j));
			}
		}
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0; i<len; i++) {
				Point tmp = Q.poll();
				for(int j=0; j<4; j++) {
					if(isAllRipen()) return L;
					
					int cx = tmp.x+dx[j];
					int cy = tmp.y+dy[j];
					
					if(cx>=1 && cx<=n && cy>=1 && cy<=m && board[cx][cy]==0) {
						board[cx][cy] = 1;
						Q.offer(new Point(cx, cy));
					}
				}
			}
			L++;
		}
		return -1;
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		m = kb.nextInt();
		n = kb.nextInt();
		
		board = new int[n+1][m+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(T.BFS());

	}
}
