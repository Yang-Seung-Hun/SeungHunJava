package five������ȯ_�����˰���;
import java.util.Arrays;
//�Ӹ� �ȵ��ư��ϱ� ����� Ǯ��ô�.
//���Ƿ� ��� ��� Ǯ����
import java.util.Scanner;

public class Solution {
	static int n,m;
	static int[] coins;
	static int[] dy;//d[i] = i�� ���� �� �ִ� ���� �ּ� ����
	
//���� ��� ���� ǬǮ��===>if�� �� ���� �� �� ����
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
	
	//�ؼ� Ǯ��
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
