package eleven�ӽù������ϱ�;
//Ǯ�� �����߾�̤�
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public int solution(int[][] arr, int n) {
		//i�� i�� �л�  j�� j�г�
		int answer = 0;
		
		
		for(int i =0; i<n; i++) {
			
		}
		

		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(T.solution(arr, n));

	}

}
