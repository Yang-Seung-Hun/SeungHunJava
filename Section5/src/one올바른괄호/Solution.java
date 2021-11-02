package one올바른괄호;

import java.util.Scanner;
import java.util.Stack;

//stack의 대표적인 문제임!!
//괄호로 뭐 하는 문제는 대부분 stack사용
//여는 괄호는 stack에 push, 닫는 괄호면 stack에서 pop하는 방식
public class Solution {
	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		
		for(char x:str.toCharArray()) {
			if(x=='(') stack.push(x);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
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
