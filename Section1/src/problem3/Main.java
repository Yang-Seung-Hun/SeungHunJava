package problem3;

import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		String answer = "";
		
		String[] temp = str.split(" ");
		int max = 0;
		for(String x : temp)
		{
			if(x.length() > max) {
				max = x.length();
				answer = x;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}

}
