package four중복순열구하기;
//내풀이는 BFS인데 , DFS로도 풀수 있음 
import java.util.Scanner;

public class Solution {
	
	static int[] pm;
	static int n, m;
	
	public void DFS(int L) {
		if(L==m) {
			for(int x: pm) System.out.print(x+" ");
			System.out.println();
		}
		
		else {//n갈래로 뻗음
			for(int i=1; i<=n; i++) {
				pm[L] = i;
				DFS(L+1);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pm = new int[m];
		T.DFS(0);
	}

}
