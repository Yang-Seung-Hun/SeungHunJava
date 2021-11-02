package ten미로탐색_DFS;

import java.util.Scanner;

public class Solution {
	static int[] dx = {-1, 0, 1, 0};//시계방향으로 뻗기 위한것
	static int[] dy = {0, 1, 0, -1};
	static int[][]board;
	static int answer = 0;
	
	public void DFS(int x, int y) {
		if(x==7 && y==7) answer++;//도착했을떄
		else {
			for(int i=0; i<4; i++) {//시계방향으로 뻗음(위 오 아 왼 방향)
				int nx = x+dx[i];
				int ny = y+dy[i];
				
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny] ==0) {//여기서 범위도 고려해줘야함 주의하자
					board[nx][ny] = 1;
					DFS(nx,ny);
					board[nx][ny] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		board = new int[8][8];
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7; j++) {
				board[i][j]=kb.nextInt();
			}
		}
		board[1][1]=1;
		T.DFS(1, 1);
		System.out.println(answer);
	}

}
