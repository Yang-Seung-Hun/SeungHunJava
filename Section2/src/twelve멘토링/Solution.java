package twelve멘토링;
//4중포문 실화냐 !!! 복잡하니까 꼭 다시 풀어보아요
import java.util.Scanner;

public class Solution {
	
public int solution(int n, int m, int[][] arr) {// m은 시험 횟수, n은 학생 수
		int answer = 0;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {//가능한 모든 멘토 멘티 조합(조건 무시한 채) 학생은 1-n까지
				int cnt = 0;//pi가 pj보다 클때 증가(m번 다 크면 조합 가능하다는 뜻)
				for(int k = 0;k<m; k++) {
					int pi = 0;
					int pj = 0;
					for(int s = 0; s<n; s++) {//k번째 시험 s등
						if(arr[k][s] == i) {
							pi = s;//k번째 시험에서 i의 등수는 s
						}
						if(arr[k][s] == j) {
							pj = s;//k번째 시험에서 j의 등수는 s
						}
					}
					if(pi<pj) {//등수 큰게 성적 낮은거
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
