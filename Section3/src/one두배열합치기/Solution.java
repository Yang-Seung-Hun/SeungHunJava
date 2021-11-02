package one두배열합치기;

import java.util.ArrayList;
import java.util.Scanner;

//배열 합쳐서 하지 말고 two pointers algorithm!!!!!
//각 배열을 가르키는 포인터(인덱스) 변수 설정(p1,p2) 
//두 배열의 p1,p2에서 값 비교후 큰 작은 값은 answer에 담고, 해당 포인터 1증가
public class Solution {
	
	public ArrayList<Integer> solution(int n, int[] arr, int m, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0;
		int p2=0;
		
		while(p1<n && p2<m) {//둘중 하나만 조건 벗어나도 조건문은 벗어남
			if(arr[p1] < arr2[p2]) {
				answer.add(arr[p1]);
				p1++;
			}
			else {
				answer.add(arr2[p2]);
				p2++;
			}
		}
		
		while(p1<n) answer.add(arr[p1++]);//배열 중 어떤게 남아 있는 배열 모르니까
		while(p2<m) answer.add(arr2[p2++]);//두개다 조건 달아 줌
		
		return answer;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		int m = kb.nextInt();
		int[] arr2 = new int[m];
		for(int i=0; i<m; i++) {
			arr2[i] = kb.nextInt();
		}
		
		for(int x: T.solution(n, arr, m, arr2)) {
			System.out.print(x+" ");
		}

	}

}
