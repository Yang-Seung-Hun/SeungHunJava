package two버블정렬;

import java.util.Scanner;

public class Main {
	
	public int[] solution(int n, int[] arr) {
		while (true) {
			int cnt = 0;
			for (int i = 0; i < n - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					cnt++;
					int tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
				}
			}
			if(cnt == 0) break;
		}
		return arr;
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
		
		for(int x:T.solution(n, arr)) {
			System.out.print(x+" ");
		}
	}
}
