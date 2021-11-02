package five최대길이연속부분수열;

import java.util.Scanner;
//앞 문제랑 비슷 한 방식이니까 다시 생각 하고 푸셈
public class Solution {
	
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		int cnt = 0;//0에서 1로 바꾼 횟수
		int lt = 0;
		
		for(int rt = 0; rt<n; rt++) {
			if(arr[rt] == 0) {
				cnt++;
			}
			while(cnt>k) {
				if(arr[lt] == 0) {
					cnt--;
				}
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
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
		System.out.println(T.solution(n, m, arr));

	}

}
