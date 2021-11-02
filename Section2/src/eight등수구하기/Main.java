package eight등수구하기;

import java.util.Scanner;

public class Main {
	
	public int[] solution(int[] arr, int n) {
		
		int[] answer = new int[n];
		
		for(int i=0; i<n; i++) {
			int rank = 1;//처음은 일등이니까
			for(int j=0; j<n; j++) {
				if(arr[i] < arr[j]) {
					rank++;
				}
				answer[i] = rank;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x:T.solution(arr, n)) {
			System.out.print(x+" ");
		}

	}
}
