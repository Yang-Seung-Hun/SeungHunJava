package tenºÀ¿ì¸®;

import java.util.Scanner;

public class Main {
	
	public int solution(int[][] arr, int n) {
		
		int answer = 0;
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<n+1; j++) {
				if(arr[i][j] >arr[i-1][j]&&arr[i][j] >arr[i][j-1]&&arr[i][j] >arr[i+1][j]&&arr[i][j] >arr[i][j+1]) {
					answer++;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n+2][n+2];
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<n+1; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(T.solution(arr, n));
	}

}
