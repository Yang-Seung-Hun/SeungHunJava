package five다익스트라알고리즘;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
	int node;
	int cost;
	public Edge(int node, int cost) {
		this.node = node;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		return this.cost-o.cost;
	}
}

public class Prac1 {
	static ArrayList<ArrayList<Edge>> graph;
	static int[] dis;
	static PriorityQueue<Edge> Pq = new PriorityQueue<>();
	
	public void solution(int node, int cost) {
		Pq.offer(new Edge(node, cost));
		
		while(!Pq.isEmpty()) {
			Edge tmp = Pq.poll();
			int nowNode = tmp.node;
			int nowCost = tmp.cost;
			
			if(nowCost>dis[nowNode]) continue;//성능 향상 부분 
			for(Edge o: graph.get(nowNode)) {
				if(dis[o.node] > o.cost+nowCost) {
					dis[o.node] = o.cost+nowCost;
					Pq.offer(new Edge(o.node,o.cost+nowCost));
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prac1 T = new Prac1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		graph = new ArrayList<ArrayList<Edge>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Edge>());
		}
		
		for(int i=1; i<=m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new Edge(b,c));
		}
		dis = new int[n+1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		dis[1] = 0;
		T.solution(1,0);
		
		for(int i=2; i<=n; i++) {
			if(dis[i] != Integer.MAX_VALUE) System.out.println(i+" : "+dis[i]);
			else System.out.println(i+" "+"impossible");
		}
	}

}
