package five쇠막대기;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	
	public int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') stack.push('(');
			else {//레이저 괄호인지 막대인지 상광없이 일단 팝시키고 경우 나눠서 생각
				stack.pop();
				if(str.charAt(i-1) == '(') answer+=stack.size();
				else answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.println(T.solution(str));

	}

}
