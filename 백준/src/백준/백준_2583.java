package 백준;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 백준_2583 {
	static int[][] arr;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static int n,m,cnt,change;
	static ArrayList<Integer> squares = new ArrayList<>();
	
	public void DFS(int x, int y) {
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 0) {
				arr[nx][ny] = 1;
				change++;
				DFS(nx, ny);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		백준_2583 T = new 백준_2583();
		Scanner kb = new Scanner(System.in);
		m = kb.nextInt();
		n = kb.nextInt();
		int k = kb.nextInt();
		arr = new int[n][m];
		
		for(int i=0; i<k; i++) {
			int x1 = kb.nextInt();
			int y1 = kb.nextInt();
			int x2 = kb.nextInt();
			int y2 = kb.nextInt();
			for(int j=x1; j<x2; j++) {
				for(int l=y1; l<y2; l++) {
					arr[j][l] = 1;
				}
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j] == 0) {
					arr[i][j] = 1;
					change++;
					T.DFS(i,j);
					cnt++;
					squares.add(change);
					change = 0;
				}
			}
		}
		
		System.out.println(cnt);
		Collections.sort(squares);
		for(int x : squares)System.out.print(x+" ");
	}
}
