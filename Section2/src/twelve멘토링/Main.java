package twelve멘토링;

import java.util.Scanner;
//감도 안잡혀요ㅜㅜ
public class Main {
	
	public int solution(int n, int n2, int[][]arr) {
		int answer = 0;
		
			
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int n2 = kb.nextInt();
		int[][] arr = new int[n2+1][n+1];
		
		for(int i=1; i<=n2; i++) {
			for(int j=1; j<=n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		for(int i=1; i<=n2; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
