package four피보나치수열;

import java.util.Scanner;

public class Solution {
	
public int[] solution(int n) {
		int[] answer= new int[n];
		answer[0]=1;
		answer[1]=1;//이거 두개는 기본이니까
		for(int i=2; i<n; i++) {
			answer[i]=answer[i-2]+answer[i-1];
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		for(int x:T.solution(n)) {
			System.out.print(x+" ");
		}
	}

}
