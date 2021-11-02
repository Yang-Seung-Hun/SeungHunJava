package three가위바위보;

import java.util.Scanner;

public class Main {
	
	public char[] solution(int[] A, int[] B, int n) {
		char[] answer = new char[n];
		
		for(int i=0; i<n; i++) {
			if(A[i] == 1) {
				if(B[i] == 1) {
					answer[i] = 'D';
				}
				
				else if(B[i] == 2) {
					answer[i] = 'B';
				}
				
				else {
					answer[i] = 'A';
				}
			}
			
			else if(A[i] == 2) {
				if(B[i] == 1) {
					answer[i] = 'A';
				}
				
				else if(B[i] == 2) {
					answer[i] = 'D';
				}
				
				else {
					answer[i] = 'B';
				}
			}
			
			else{
				if(B[i] == 1) {
					answer[i] = 'B';
				}
				
				else if(B[i] == 2) {
					answer[i] = 'A';
				}
				
				else {
					answer[i] = 'D';
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
		int[] A = new int[n];
		int[] B = new int[n];
		
		for(int i=0; i<n; i++) {
			A[i] = kb.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			B[i] = kb.nextInt();
		}
		
		for(char x:T.solution(A, B, n)) {
			System.out.println(x);
		}

	}
}
