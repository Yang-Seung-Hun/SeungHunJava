package eight수열추측하기;
//공식같은거 있음 ==> b배열이랑 p배열 인덱스 같은거 끼리 곱한 후 더하는부분
//수열이랑, 조합 사용해서 풀어야함
//복잡하니까 다시 꼼꼼히 보기

import java.util.Scanner;

public class Solution {
	
	static int[] b,p,ch;
	static int n,f;
	boolean flag = false;
	int[][] dy = new int[35][35];//컴비네이션 함수용 
	
	public int combi(int n, int r) {//p배열에 컴비네이션 집어 넣을 때 사용
		if(dy[n][r]>0) return dy[n][r];
		if(n==r || r==0) return 1;
		else return dy[n][r] = combi(n-1, r-1) + combi(n-1,r);
	}
	
	public void DFS(int L, int sum) {
		if(flag) return;
		if(L == n) {
			if(sum == f) {
				for(int x:p)System.out.print(x+" ");
				flag = true;
			}
		}
		else {
			for(int i=1; i<=n; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					p[L] = i;
					DFS(L+1,sum+(p[L]*b[L]));
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		f = kb.nextInt();
		b = new int[n];
		p = new int[n];
		ch = new int[n+1];
		for(int i=0; i<n; i++) {
			b[i] = T.combi(n-1, i);
		}
		T.DFS(0,0);
	}

}
