package one��ܿ�����;
//ū������ �������� �ɰ��� Ǫ�� ���
//��� 7���� ���� ��� 
//1�� ������� �� �� �ִ� ����� 1���� => (d[1] = 1)
//2�� ����� 1����ܿ��� �ü� �ִ� ���  + 0������ �ü� �ִ� ��� ���� 2����  => (d[2] = 2);
//3�� ����� 1����ܿ��� �ü� �ִ� ���(d[1]) + 2�� ���� �� �� �ִ� ���(d[2]) => d[1]+d[2];
//������ ������� �Ǻ���ġ ���� ���� Ǯ�� ��

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
