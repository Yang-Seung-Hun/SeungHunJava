package five동전교환;

import java.util.Arrays;
import java.util.Collections;

//BFS로는 풀었음
//DFS로는 시간초과 뜸 ===> 큰 값 먼저 적용할게 끔 배열 정렬 후, answer가 L보다 크면 의미 없으므로 return 시켜 시간 복잡도 줄임

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int n;
	static int m;
	static Integer[] arr;
	
	static int answer = Integer.MAX_VALUE;//DFS용
	static int L = 0;//BFS용
	
	public void DFS(int L, int sum) {
		if(L>=answer) return;//시간 복잡도 줄이는 용도
		if(sum>m)return;
		if(sum == m) {
			answer = Math.min(L, answer);
		}
		
		else {
			for(int i=0; i<n; i++) {
				DFS(L+1,sum+arr[i]);
			}
		}
		
	}
	
//	public void BFS(int val) {
//		
//		Queue<Integer> Q = new LinkedList<>();
//		Q.offer(val);
//		
//		while(!Q.isEmpty()) {
//			int len = Q.size();
//			for(int i=0; i<len; i++) {
//				int tmp = Q.poll();
//				for(int j=0; j<n; j++) {
//					if(tmp+arr[j] == m) {
//						L++;
//						return;
//					}
//					Q.offer(tmp+arr[j]);
//				}
//			}
//			L++;
//		}
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		arr = new Integer[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		Arrays.sort(arr,Collections.reverseOrder());//시간 복잡도 줄이기 용도임. reverseOrder()쓸려면 int가 아니라 Integer써야함
		m = kb.nextInt();
		T.DFS(0,0);
		System.out.println(answer);
		
//		T.BFS(0);
//		System.out.println(L);
	}
}
