package seven교육과정설계;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	
	public String solution(String str, String str2) {
		String answer = "YES";
		Queue<Character> Q = new LinkedList<>();
		
		for(char x:str.toCharArray())Q.offer(x);
		for(char x:str2.toCharArray()) {
			if(Q.contains(x)) {//필수과목이면
				if(x!=Q.poll()) return "NO";//큐젤 앞에있는지 확인 아니면 "NO"반환
			}
			if(!Q.isEmpty()) return "NO";//필수 과목 다 안든 경우
		}
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
