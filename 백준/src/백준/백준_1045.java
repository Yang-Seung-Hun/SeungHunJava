package 백준;
//백준 1045 무제 냅색인데 바이너리 까지 사용해서 풀어야함 존나 복잡함
//다시 풀어봅시다.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 백준_1045 {
	static int n,c;
	static int[] leftArray,rightArray;
	static int answer = 0;
	static ArrayList<Integer> left = new ArrayList<>();
	static ArrayList<Integer> right = new ArrayList<>();
	
	public void DFS(int L, int sum, ArrayList<Integer> list, int[] arr) {

		if(sum>c) return;
		
		if(L == arr.length) {
			list.add(sum);
			return;
		}
		else {
			DFS(L+1,sum+arr[L], list, arr);
			
			DFS(L+1, sum, list, arr);
		}
	}
	
	public void solution() {
		Collections.sort(right);
		for(int i=0; i<left.size(); i++) {
			int l = 0;
			int r = right.size()-1;
			int m = (r+l)/2;
			
			while(l<=r) {
				if(right.get(m)+left.get(i) <= c) {
					l = m+1;
				}
				else {
					r = m-1;
				}
				m = (r+l)/2;
			}
			int tmp = m+1;
			answer = answer+tmp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		백준_1045 T = new 백준_1045();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		c = kb.nextInt();
		leftArray = new int[n/2];
		rightArray = new int[n-n/2];
		for(int i=0; i<leftArray.length; i++) {
			leftArray[i] = kb.nextInt();
		}
		for(int i=0; i<rightArray.length; i++) {
			rightArray[i] = kb.nextInt();
		}
		
		T.DFS(0, 0, left, leftArray);
		T.DFS(0, 0, right, rightArray);
		
		T.solution();
		System.out.println(answer);

//		Collections.sort(right);
//		for(int x: left) System.out.print(x+" ");
//		System.out.println();
//		for(int x: right) System.out.print(x+" ");
	}
}
