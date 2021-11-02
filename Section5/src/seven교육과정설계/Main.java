package seven교육과정설계;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public String solution(String str, String str2) {
		String answer = "NO";
		Queue<Character> Q = new LinkedList<>();
		Queue<Character> Q2 = new LinkedList<>();
		
		for(int i=0; i<str.length(); i++) {
			Q.offer(str.charAt(i));
		}
		
		for(char x:str2.toCharArray()) {
			if(Q.contains(x)) Q2.offer(x);
		}
		
		if(Q.equals(Q2)) answer = "YES";
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main  T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		String str2 = kb.next();
		
		System.out.println(T.solution(str, str2));
	}
}
