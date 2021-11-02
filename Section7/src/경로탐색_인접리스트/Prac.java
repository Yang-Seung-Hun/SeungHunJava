package 경로탐색_인접리스트;

//출제의도 : DFS연습 및 인접리스트 사용 ==> 또 강의 듣고 풀었음

import java.util.ArrayList;
import java.util.Scanner;

public class Prac {
	static int n,m,answer = 0;
	static int[] ch;
	static ArrayList<ArrayList<Integer>> graph;
	
	public void DFS(int val) {
		if(val == n) answer++;
		
		else {
			for(int x: graph.get(val)) {
				if(ch[x] == 0) {
					ch[x] = 1;
					DFS(x);
					ch[x] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prac T = new Prac();
		Scanner kb = new Scanner(System.in);
		
		n=kb.nextInt();
		m=kb.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n;i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i=1; i<=m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		
		
		ch = new int[n+1];
		ch[1] = 1;
		
		T.DFS(1);
		System.out.println(answer);
		
		
	}

}
