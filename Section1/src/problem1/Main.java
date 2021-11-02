package problem1;

import java.util.Scanner;

public class Main {
	
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();//문자열을 다 대문자
		t = Character.toUpperCase(t);//문자하나를 대문자
		
		//향상된 for문으로
		for(char x : str.toCharArray()) {
			if(x == t)
			{
				answer++;
			}
		}
		
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i) == t) {
//				answer++;
//			}
//		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);//문자열에서 0번째 문자
		System.out.println(T.solution(str, c));
	}
}
