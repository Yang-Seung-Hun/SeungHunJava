package ���Ž��_��������Ʈ;

import java.util.ArrayList;
import java.util.Scanner;

//���� ��, ���� ��, ���� ������� �־����� �� 1���� n���� ���� ��� �� ���ϱ�
//������ ���� �þ ���� ���� ��ĺ��ٴ� ��������Ʈ�� ��������
//�Է�
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

//���
//6

public class Main {
	static int n,m, answer =0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int i=0; i<graph.get(v).size(); i++) {
				if(ch[graph.get(v).get(i)]==0) {
					ch[graph.get(v).get(i)] = 1;
					DFS(graph.get(v).get(i));
					ch[graph.get(v).get(i)] = 0;
				}
			}
//for each�� �ϴ°� �ξ� ������
//			for(int nv : graph.get(v)) {
//				if(ch[nv] ==0) {
//					ch[nv] = 1;
//					DFS(nv);
//					ch[nv] = 0;
//				}
//			}
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
		for(int i=0; i<m; i++) {
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
