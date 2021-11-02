package 그래프최단거리_BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Prac {
	
	static int n,m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	static int[] dis;
	
	public void BFS(int val) {
		Queue<Integer> Q = new LinkedList<>();
		int L = 1;
		Q.offer(val);
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				int tmp = Q.poll();
				for (int x : graph.get(tmp)) {
					if (ch[x] == 0) {
						ch[x] = 1;
						dis[x] = L;
						Q.offer(x);
					}
				}
			}
			L++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prac T = new Prac();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();
		
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i=1; i<=m;i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		
		ch = new int[n+1];
		ch[1] = 1;
		
		dis = new int[n+1];
		dis[1] = 0;
		
		T.BFS(1);
		for(int i=2; i<=n; i++) {
			System.out.println(i+" : "+dis[i]);
		}

	}

}
