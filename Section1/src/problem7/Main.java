package problem7;

import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		String answer = "";
		
		str = str.toUpperCase();
		String rStr = new StringBuilder(str).reverse().toString();
		
		if(rStr.equals(str)) {
			answer = "YES";
		}
		
		else {
			answer = "NO";
		}
		
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
