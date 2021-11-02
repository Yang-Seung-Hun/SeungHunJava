package five������ȯ;

import java.util.Arrays;
import java.util.Collections;

//BFS�δ� Ǯ����
//DFS�δ� �ð��ʰ� �� ===> ū �� ���� �����Ұ� �� �迭 ���� ��, answer�� L���� ũ�� �ǹ� �����Ƿ� return ���� �ð� ���⵵ ����

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int n;
	static int m;
	static Integer[] arr;
	
	static int answer = Integer.MAX_VALUE;//DFS��
	static int L = 0;//BFS��
	
	public void DFS(int L, int sum) {
		if(L>=answer) return;//�ð� ���⵵ ���̴� �뵵
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
		Arrays.sort(arr,Collections.reverseOrder());//�ð� ���⵵ ���̱� �뵵��. reverseOrder()������ int�� �ƴ϶� Integer�����
		m = kb.nextInt();
		T.DFS(0,0);
		System.out.println(answer);
		
//		T.BFS(0);
//		System.out.println(L);
	}
}
