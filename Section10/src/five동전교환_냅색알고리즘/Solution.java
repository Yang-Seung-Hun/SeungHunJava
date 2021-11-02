package five동전교환_냅색알고리즘;
import java.util.Arrays;
//머리 안돌아가니까 담번에 풀어봅시다.
//강의로 방법 듣고 풀었음
import java.util.Scanner;

public class Solution {
	static int n,m;
	static int[] coins;
	static int[] dy;//d[i] = i원 만들 수 있는 동전 최소 개수
	
//설명만 듣고 내가 푼풀이===>if문 안 쓰고 할 수 있음
//	public void solution() {
//		Arrays.fill(dy, Integer.MAX_VALUE);
//		for(int i=0; i<n; i++) {
//			int cc = coins[i];
//			dy[cc] = 1;
//			for(int j=cc+1; j<=m; j++) {
//				if(dy[j-cc] != Integer.MAX_VALUE) dy[j] = Math.min(dy[j], dy[j-cc]+1);
//			}
//		}
//	}
	
	//해설 풀이
	public void solution() {
		Arrays.fill(dy, Integer.MAX_VALUE);
		dy[0] = 0;
		for(int i=0; i<n; i++) {
			int cc = coins[i];
			for(int j=cc; j<=m; j++) {
				dy[j] = Math.min(dy[j], dy[j-cc]+1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		coins = new int[n];
		for(int i=0; i<n; i++) {
			coins[i] = kb.nextInt();
		}
		m = kb.nextInt();
		dy = new int[m+1];
		T.solution();
		System.out.println(dy[m]);
	}
}
