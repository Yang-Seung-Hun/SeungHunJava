package three최대점수구하기_DFS;

import java.util.Scanner;

public class Main {
	static int answer = 0;
	static int m;
	static int n;
	
	public void DFS(int L, int s, int t, int[] arr1, int[] arr2) {
		if(t>m) return;
		if(L == n) {
			answer = Math.max(s, answer);
		}
		else {
			
			DFS(L+1, s+arr1[L], t+arr2[L], arr1, arr2);
			
			DFS(L+1, s, t, arr1, arr2);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for(int i=0; i<n; i++) {
			arr1[i] = kb.nextInt();
			arr2[i] = kb.nextInt();
		}
		T.DFS(0, 0, 0, arr1, arr2);
		System.out.println(answer);
	}
}
