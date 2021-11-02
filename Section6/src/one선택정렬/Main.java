package one선택정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		
		Arrays.sort(arr);
		answer = arr;
		
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
		
		for(int x:T.solution(n, arr)) {
			System.out.print(x+" ");
		}

	}
}
