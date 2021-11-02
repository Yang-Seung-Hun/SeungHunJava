package four연속부분수열;

import java.util.Scanner;
//이방식을 혼자 다시 풀어보기
public class Solution {
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int sum = 0;//lt부터 rt까지
		int lt = 0;//왼쪽 포인터 생성
		for(int rt = 0; rt<n; rt++) {
			sum= sum+arr[rt];
			if(sum == m) {
				answer++;
			}
			while(sum>=m) {
				sum = sum-arr[lt++];
				if(sum == m) {
					answer++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n,m,arr));

	}

}
