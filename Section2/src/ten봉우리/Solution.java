package ten봉우리;

import java.util.Scanner;

public class Solution {
	int[] dx = {-1,0,1,0};
	int[] dy = {0,1,0,-1};//상하자우를 인덱스로 표현
public int solution(int[][] arr, int n) {
		int answer = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean flag = true;
				for(int k=0; k<4; k++) {//상하좌우 인덱스를 통해 인덱스 표시
					int nx = i+dx[k];
					int ny = j+dy[k];
					if(nx>=0&&nx<n&&ny>=0&&ny<n&&arr[nx][ny]>=arr[i][j]) {
						//위 앞에 조건 4개는 경계값 표현 outofbound 예외 처리
						flag = false;//여기서 아닌 거 거름
						break;//하나라도 아니면 아니니까 반복문 탈출
					}
				}
				if(flag) answer++;//계수 증가
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
