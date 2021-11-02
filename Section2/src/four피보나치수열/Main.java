package four피보나치수열;

import java.util.Scanner;

public class Main {
	
	public String solution(int n) {
		String answer = "1 1";
		
		int b = 1;
		int a = 1;
		
		for(int i=0; i<n-2; i++) {
			int s = a+b;
			b = a;
			a = s;
			answer = answer+" "+s;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
