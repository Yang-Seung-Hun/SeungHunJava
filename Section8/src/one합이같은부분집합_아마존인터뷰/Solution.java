package one합이같은부분집합_아마존인터뷰;

import java.util.Scanner;

public class Solution {
	
	static String answer = "NO";
	static int n, total = 0;
	boolean flag = false;
	
	public void DFS(int L, int sum, int[] arr) {
		if(flag) return;//flag가 true되면 stack에 쌓여있는 것들 굳이 안해도 됨
		if(sum>total/2) return;//이렇게 되면 굳이 다음 단계를 할 필요가 없음
		if(L == n) {
			if((total-sum) == sum) {
				answer = "YES";
				flag = true;
			}
		}
		else {
			DFS(L+1,sum+arr[L],arr);
			DFS(L+1,sum,arr);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++) {
			arr[i] = kb.nextInt();
			total+=arr[i];
		}
		
		T.DFS(0, 0, arr);
		System.out.println(answer);

	}

}
