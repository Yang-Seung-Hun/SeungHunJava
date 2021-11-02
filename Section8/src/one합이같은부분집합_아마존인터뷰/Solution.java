package one���̰����κ�����_�Ƹ������ͺ�;

import java.util.Scanner;

public class Solution {
	
	static String answer = "NO";
	static int n, total = 0;
	boolean flag = false;
	
	public void DFS(int L, int sum, int[] arr) {
		if(flag) return;//flag�� true�Ǹ� stack�� �׿��ִ� �͵� ���� ���ص� ��
		if(sum>total/2) return;//�̷��� �Ǹ� ���� ���� �ܰ踦 �� �ʿ䰡 ����
		if(L == n) {
			if((total-sum) == sum) {
				answer = "YES";
				flag = true;
			}
		}
		else {
			DFS(L+1,sum+arr[L],arr);
			DFS(L+1,sum,arr);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++) {
			arr[i] = kb.nextInt();
			total+=arr[i];
		}
		
		T.DFS(0, 0, arr);
		System.out.println(answer);

	}

}
