package 백준;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 백준_2667 {
	static int[][] arr;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static int n, change, cnt;
	static ArrayList<Integer> list = new ArrayList<>();
	
	public void DFS(int x, int y) {
		
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] == 1) {
				arr[nx][ny] =0;
				change++;
				DFS(nx, ny);
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		백준_2667 T = new 백준_2667();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			String s = kb.next();
			char[] c = s.toCharArray();
			for(int j=0; j<c.length; j++) {
				arr[i][j] = (int)(c[j])-48;
			}
		}
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j] == 1) {
					arr[i][j] = 0;
					change++;
					T.DFS(i, j);
					cnt++;
					list.add(change);
					change = 0;
				}
			}
		}
		
		Collections.sort(list);
		System.out.println(cnt);
		for(int x:list)System.out.println(x);

	}
}
