package 경로탐색_인접행렬;

//정점 수, 간선 수, 간선 경로정보 주어졌을 때 1에서 n까지 가는 경로 수 구하기

//입력
//5 9
//1 2
//1 3
//1 4
//2 1
//2 3
//2 5
//3 4
//4 2
//4 5

//출력
//6

import java.util.Scanner;

public class Main {
	static int n,m,answer = 0;
	static int[] ch;
	static int[][] graph;
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int i=1; i<=n; i++) {
				if(graph[v][i]==1 && ch[i]==0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		for(int i=1; i<=m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph[a][b] = 1;
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}

}
