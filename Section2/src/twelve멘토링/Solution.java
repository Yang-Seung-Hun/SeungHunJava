package twelve���丵;
//4������ ��ȭ�� !!! �����ϴϱ� �� �ٽ� Ǯ��ƿ�
import java.util.Scanner;

public class Solution {
	
public int solution(int n, int m, int[][] arr) {// m�� ���� Ƚ��, n�� �л� ��
		int answer = 0;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {//������ ��� ���� ��Ƽ ����(���� ������ ä) �л��� 1-n����
				int cnt = 0;//pi�� pj���� Ŭ�� ����(m�� �� ũ�� ���� �����ϴٴ� ��)
				for(int k = 0;k<m; k++) {
					int pi = 0;
					int pj = 0;
					for(int s = 0; s<n; s++) {//k��° ���� s��
						if(arr[k][s] == i) {
							pi = s;//k��° ���迡�� i�� ����� s
						}
						if(arr[k][s] == j) {
							pj = s;//k��° ���迡�� j�� ����� s
						}
					}
					if(pi<pj) {//��� ū�� ���� ������
						cnt++;
					}
				}
				if(cnt == m) {
					answer++;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[][] arr= new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(T.solution(n, m, arr));
	}
}
