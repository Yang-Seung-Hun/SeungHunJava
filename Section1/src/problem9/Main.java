package problem9;

import java.util.Scanner;

public class Main {
	
	public int solution(String str) {
		int answer = 0;
		
		str = str.toUpperCase().replaceAll("[A-Z]", "");
		answer = Integer.parseInt(str);
		
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
