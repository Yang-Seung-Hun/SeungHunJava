package five�踷���;
//�𸣰ڴ� ���� ����� ���� ����
//�ݴ� ��ȣ�� ���������� ��������� �������� -> ��������� ������
//������ �������� �������� �� ����� ������ŭ �þ -> �̰� �������� ��� ���ηθ� ������ ����


import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		
		char before = 0;
		for(char x : str.toCharArray()) {
			if(x == '(') stack.push(x);
			
			else if(x == ')' && before=='(') {
				stack.pop();
				answer = answer+stack.size();
			}	
			
			else if(x == ')' && before!='('){
 				stack.pop();
				answer = answer + 1;
			}
			before = x;
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
