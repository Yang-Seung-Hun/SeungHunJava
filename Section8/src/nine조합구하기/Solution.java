package nine조합구하기;
//start라는 시작 인덱스 변수를 설정 해서 풀기
//조합은 그냥 방식을 암기해버리자

import java.util.Scanner;

public class Solution {
	
	static int n,m;
	static int[] combi;
	
	public void DFS(int L, int start) {
		
		if(L == m) {
			for(int x:combi) System.out.print(x+" ");
			System.out.println();
		}
		
		else {
			for(int i = start; i<=n; i++) {//첫번째 인덱스로 start쓰기
				combi[L] = i;
				DFS(L+1,i+1);//다음 스타트를 1증가 시키기
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		 
		n = kb.nextInt();
		m = kb.nextInt();
		
		combi = new int[m];
		
		T.DFS(0,1);
	}

}
