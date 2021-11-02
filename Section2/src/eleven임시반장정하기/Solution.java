package eleven임시반장정하기;
//꼭 환자 다시 풀어보자
import java.util.Scanner;

public class Solution {
	
public int solution(int n, int[][] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		for(int i=1; i<=n; i++) {//i번 학생
			int cnt = 0;
			for(int j = 1; j<=n; j++) {//j번 학생
				for(int k=1; k<=5; k++) {//1학년부터 5학년
					if(arr[i][k] == arr[j][k]) {
						cnt++;//한번 카운트 하면 break해야함
						break;
					}
				}
			}
			if(cnt>max) {
				max = cnt;
				answer = i;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n+1][6];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=5; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(T.solution(n,arr));
	}

}
