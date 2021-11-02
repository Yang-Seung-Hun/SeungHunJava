package twelve토마토_BFS활용;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//class Point{
//	int x;
//	int y;
//	public Point(int x, int y) {
//		this.x =x;
//		this.y =y;
//	}
//}
//
//public class Solution {
//	static int m,n;
//	static int[][] board;
//	static int[][] dis;//날 수 표시용
//	static int[] dx = {-1,0,1,0};
//	static int[] dy = {0,1,0,-1};
//	static Queue<Point> Q = new LinkedList<>();
//	
//	public void BFS() {
//		
//		while(!Q.isEmpty()) {
//			Point tmp = Q.poll();
//			for(int i=0; i<4; i++) {
//				int nx = tmp.x+dx[i];
//				int ny = tmp.y+dy[i];
//				if(nx>=1 && nx<=n && ny>=1 && ny<=m && board[nx][ny] == 0) {
//					board[nx][ny] = 1;
//					Q.offer(new Point(nx,ny));
//					dis[nx][ny] = dis[tmp.x][tmp.y]+1;
//				}
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Solution T = new Solution();
//		Scanner kb = new Scanner(System.in);
//		m = kb.nextInt();
//		n = kb.nextInt();
//		board = new int[n+1][m+1];
//		dis = new int[n+1][m+1];
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=m; j++) {
//				board[i][j] = kb.nextInt();
//				if(board[i][j] == 1) Q.offer(new Point(i,j));
//			}
//		}	
//		
//		T.BFS();
//		boolean flag = true;
//		int answer = Integer.MIN_VALUE;
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=m; j++) {
//				if(board[i][j] == 0) flag = false;
//			}
//		}
//		if(flag) {
//			for(int i=1; i<=n; i++) {
//				for(int j=1; j<=m; j++) {
//					answer = Math.max(answer, dis[i][j]);
//				}
//			}
//		}
//	}
//}
