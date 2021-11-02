package one계단오르기;
//큰문제를 여러개로 쪼개서 푸는 방식
//계단 7개로 예시 들면 
//1번 계단으로 갈 수 있는 방법은 1가지 => (d[1] = 1)
//2번 계단은 1번계단에서 올수 있는 방법  + 0번에서 올수 있는 방법 으로 2가지  => (d[2] = 2);
//3번 계단은 1번계단에서 올수 있는 방법(d[1]) + 2번 에서 올 수 있는 방법(d[2]) => d[1]+d[2];
//위같은 방식으로 피보나치 수열 마냥 풀면 됨

import java.util.Scanner;

public class Solution {
	static int[] dy;
	
	public int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		for(int i=3; i<=n; i++) {
			dy[i] = dy[i-2]+dy[i-1];
		}
		return dy[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		dy = new int[n+1];
		System.out.println(T.solution(n));
	}
}
