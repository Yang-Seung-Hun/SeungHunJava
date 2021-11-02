package six최대점수구하기_냅색알고리즘;
//dfs로 풀었음 심지어 생각안나서 강의 봄......
//복습 하자!!!
//dfs는 n,m값커지고 하면 시간제한 걸릴 수 있으니 냅색알고리즘으로도 풀어야함

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
