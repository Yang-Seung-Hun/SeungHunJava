package nine격자판최대합;

import java.util.Scanner;

public class Solution {
	
public int solution(int n, int[][]arr) {
		int answer= Integer.MIN_VALUE;//정수 중 최솟값
		int sum1, sum2;
		for(int i=0; i<n; i++) {
			sum1=sum2=0;
			for(int j=0; j<n; j++) {
				sum1+=arr[i][j];//i행의 합
				sum2+=arr[j][i];//i열의 합
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		
		sum1=sum2=0;
		for(int i=0; i<n; i++) {
			sum1+=arr[i][i];//대각선 1
			sum2+=arr[i][n-i-1];//대각선2
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr =new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(T.solution(n,arr));

	}

}
