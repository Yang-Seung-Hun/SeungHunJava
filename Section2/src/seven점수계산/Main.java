package seven점수계산;

import java.util.Scanner;

public class Main {
	
	public int solution(int[] arr, int n) {
		int answer = 0;
		int[] score = new int[n];
		
		int tmp = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] == 1) {
				tmp++;
			}
			
			else {
				tmp = 0;
			}
			score[i] = tmp;
		}
		
		for(int x:score) {
			answer = answer+x;
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
		
		System.out.println(T.solution(arr, n));

	}

}
