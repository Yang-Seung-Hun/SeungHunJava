package five�ִ���̿��Ӻκм���;

import java.util.Scanner;
//�� ������ ��� �� ����̴ϱ� �ٽ� ���� �ϰ� Ǫ��
public class Solution {
	
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		int cnt = 0;//0���� 1�� �ٲ� Ƚ��
		int lt = 0;
		
		for(int rt = 0; rt<n; rt++) {
			if(arr[rt] == 0) {
				cnt++;
			}
			while(cnt>k) {
				if(arr[lt] == 0) {
					cnt--;
				}
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, m, arr));

	}

}
