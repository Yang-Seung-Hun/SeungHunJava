package ���Ž��_�������;

import java.util.Scanner;

//���� ��, ���� ��, ���� ������� �־����� �� 1���� n���� ���� ��� �� ���ϱ�

//�����ǵ� : DFS����  ==> ���� �ٽ� ���� Ǯ���� 


public class Prac {
	static int m,n,answer = 0 ;
	static int[][] graph;
	static int ch[];
	
	public void DFS(int val) {
		if(val == n) answer++;
		else {
			for(int i=1; i<=n; i++) {
				if(graph[val][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prac T = new Prac();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new int[n+1][n+1];
		
		for(int i=1; i<=m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph[a][b] = 1;
		}
		
		ch = new int[n+1];
		ch[1] = 1;
		
		T.DFS(1);
		System.out.println(answer);
	}

}
