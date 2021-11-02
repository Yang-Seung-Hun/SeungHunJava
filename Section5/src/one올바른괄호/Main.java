package one올바른괄호;

import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		String answer = "NO";
		
		int a = 0;
		int b = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(a<b) return "NO";
			else {
				if(str.charAt(i) == '(') a++;
				else b++;
			}
		}
		if(a==b) answer = "YES";
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.println(T.solution(str));
	}
}
