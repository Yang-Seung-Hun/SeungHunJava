package 백준;

import java.util.Scanner;

public class 백준_1987 {
	static int r,c;
	static char[][] board;
	static int[] ch = new int[26];//알파벳 중복 체크용 A=65
	static int[] dy = {0,1,0,-1};
	static int[] dx = {-1,0,1,0};
	static int answer = 0;
	
	public boolean isThereWay(int x, int y) {
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 1 && nx <= r && ny >= 1 && ny <= c && ch[board[nx][ny]-65] != 1) {
				return true;
			}
		}
		return false;
	}
	
	public void solution(int x, int y) {
		if(!isThereWay(x,y)) {
			System.out.println(answer);
			answer = 0;
			return;
		}
		
		else {
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 1 && nx <= r && ny >= 1 && ny <= c && ch[board[nx][ny]-65] != 1) {
					answer++;
					ch[board[nx][ny] - 65] = 1;
					solution(nx, ny);
					ch[board[nx][ny] - 65] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		백준_1987 T = new 백준_1987();
		Scanner kb = new Scanner(System.in);
		r = kb.nextInt();
		c = kb.nextInt();
		board = new char[r+1][c+1];
		for(int i=1; i<r+1; i++) {
			for(int j=1; j<c+1; j++) {
				board[i][j] = kb.next().charAt(0);
			}
		}
		ch[(int)board[1][1] - 65] = 1;
		answer++;
		T.solution(1, 1);
		
	}

}
