package six�ִ��������ϱ�_�����˰���;
//dfs�� Ǯ���� ������ �����ȳ��� ���� ��......
//���� ����!!!
//dfs�� n,m��Ŀ���� �ϸ� �ð����� �ɸ� �� ������ �����˰������ε� Ǯ�����

import java.util.ArrayList;
import java.util.Scanner;

class P{
	int score;
	int time;
	public P(int score, int time) {
		this.score = score;
		this.time = time;
	}
}

public class Main {
	static int n,m;
	static ArrayList<P> list = new ArrayList<>();
	static int answer = 0;
	
	public void DFS(int L, int s, int t) {
		
		if(t>m) return;
		
		if(L==n) {
			answer = Math.max(answer, s);
			return;
		}
		
		else {
			
			DFS(L+1,s+list.get(L).score,t+list.get(L).time);
			
			DFS(L+1,s,t);
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();
		for(int i=0; i<n; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			list.add(new P(a,b));
		}
		T.DFS(0,0,0);
		System.out.println(answer);
	}
}
