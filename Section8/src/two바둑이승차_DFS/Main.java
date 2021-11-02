package two¹ÙµÏÀÌ½ÂÂ÷_DFS;

import java.util.Scanner;

public class Main {
	static int answer = 0;
	static int n;
	static int c;
	
	public void DFS(int l, int sum , int[] arr) {
		if(sum <= c) answer = Math.max(sum, answer);
		if(sum > c) return;
		if(l == n) return;
		else {
			DFS(l+1,sum+arr[l],arr);
		
			DFS(l+1,sum,arr);
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		c = kb.nextInt();
		n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		T.DFS(0,0,arr);
		System.out.println(answer);
	}

}
