package seven��������_�ּҽ��Ǵ�;
//���� �˰���
//�켱���� ť ����� ==>greedy
//�湮 üũ�� �迭 �������
//�湮 ���� ��常 ť�� �־���
//�湮 ���� ��常 answer�� ��� ������
//���ͽ�Ÿ��� �ٸ��� graph ���� ��  ��������� �־������

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class E implements Comparable<E>{
	int v;
	int cost;
	public E (int v, int cost) {
		this.v = v;
		this.cost = cost;
	}
	@Override
	public int compareTo(E o) {
		// TODO Auto-generated method stub
		return this.cost - o.cost;
	}
}
public class Solution2 {
	
	static ArrayList<ArrayList<E>> graph;
	static int[] ch;
	static PriorityQueue<E> pq = new PriorityQueue<>();
	static int answer = 0;
	
	public void solution(int v, int c) throws InterruptedException {
		pq.offer(new E(v,c));
		
		while(!pq.isEmpty()) {
			E tmp = pq.poll();
			int nv = tmp.v;
			int nc = tmp.cost;
			if(ch[nv] == 0) {
				answer = answer+nc;
				ch[nv] = 1;
			}
			for(E x: graph.get(nv)) {
				if(ch[x.v] == 0) {
					pq.offer(x);//�ؼ��� �̺κ� ��ü ���� ���� �־���
					//pq.offer(new Edge(o.v,o.cost);
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Solution2 T = new Solution2();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		ch = new int[n+1];
		graph = new ArrayList<ArrayList<E>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<E>());
		}
		
		for(int i=1; i<=m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new E(b,c));
			graph.get(b).add(new E(a,c));
		}
		ch[1] = 1;
		T.solution(1,0);
		System.out.println(answer);
	}
}
