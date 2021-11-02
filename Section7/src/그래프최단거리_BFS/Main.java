package 그래프최단거리_BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//정점의 수, 간선의 수, 연결정보 주어질때
//1번 정점에서 나머지 정점으로 가는 최소 이동 간선수 구하기
//level로 풀이는 혼자 숙제로 해보기
//지금 풀이는 dis라는 거리 배열을 만들어서 푸심 

//입력
//6 9
//1 3
//1 4
//2 1
//2 5
//3 4
//4 5
//4 6
//6 2
//6 5

//출력
//2 : 3
//3 : 1
//4 : 1
//5 : 2
//6 : 2

public class Main {
	
	static int n,m = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	
	public void BFS(int v) {
		Queue<Integer> queue = new LinkedList<>();
		ch[v]=1;
		dis[v]=0;
		queue.offer(v);
		while(!queue.isEmpty()) {
			int cv = queue.poll();
			for(int nv : graph.get(cv)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					queue.offer(nv);
					dis[nv] = dis[cv]+1;
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
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		dis = new int[n+1];
		for(int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		T.BFS(1);
		for(int i=2; i<=n; i++) {
			System.out.println(i+" : "+dis[i]);
		}
	}

}
