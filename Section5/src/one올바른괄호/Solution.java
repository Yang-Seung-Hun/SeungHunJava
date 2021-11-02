package one�ùٸ���ȣ;

import java.util.Scanner;
import java.util.Stack;

//stack�� ��ǥ���� ������!!
//��ȣ�� �� �ϴ� ������ ��κ� stack���
//���� ��ȣ�� stack�� push, �ݴ� ��ȣ�� stack���� pop�ϴ� ���
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
