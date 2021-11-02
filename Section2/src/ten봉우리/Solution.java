package ten���츮;

import java.util.Scanner;

public class Solution {
	int[] dx = {-1,0,1,0};
	int[] dy = {0,1,0,-1};//�����ڿ츦 �ε����� ǥ��
public int solution(int[][] arr, int n) {
		int answer = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean flag = true;
				for(int k=0; k<4; k++) {//�����¿� �ε����� ���� �ε��� ǥ��
					int nx = i+dx[k];
					int ny = j+dy[k];
					if(nx>=0&&nx<n&&ny>=0&&ny<n&&arr[nx][ny]>=arr[i][j]) {
						//�� �տ� ���� 4���� ��谪 ǥ�� outofbound ���� ó��
						flag = false;//���⼭ �ƴ� �� �Ÿ�
						break;//�ϳ��� �ƴϸ� �ƴϴϱ� �ݺ��� Ż��
					}
				}
				if(flag) answer++;//��� ����
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(T.solution(arr, n));

	}

}
