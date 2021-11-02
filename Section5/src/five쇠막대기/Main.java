package five쇠막대기;
//모르겠다 왜케 정답률 높냐 ㅅㅂ
//닫는 괄호가 레이저인지 막대기인지 구별해줌 -> 여기까지는 생각함
//레이저 만났을때 레이저가 쏜 막대기 개수만큼 늘어남 -> 이걸 생각못함 계속 세로로만 생각함 병신


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
