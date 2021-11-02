package nine���ձ��ϱ�;
//start��� ���� �ε��� ������ ���� �ؼ� Ǯ��
//������ �׳� ����� �ϱ��ع�����

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
			for(int i = start; i<=n; i++) {//ù��° �ε����� start����
				combi[L] = i;
				DFS(L+1,i+1);//���� ��ŸƮ�� 1���� ��Ű��
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
