package two괄호문자제거;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		
		for(char x:str.toCharArray()) {
			if(x == ')') {
				while(stack.pop() != '(');
			}
			
			else stack.push(x);
		}
		
		for(char x: stack) {
			answer = answer+x;
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
