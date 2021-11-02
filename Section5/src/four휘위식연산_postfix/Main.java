package four휘위식연산_postfix;
//모르겠다...
//먼저 크게 접근 방식 설명듣고 풀었음
//문자열 탐색하면서 숫자이면 stack에 담고 연산자면 stack에서 pop함 먼저 pop한게 연산자의 오른쪽으로 가고 나중에 꺼낸게 연산자의 왼쪽으로가게 함 그리고 연산 결과를 스텍에 푸시함
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		int lt = 0;//연산자 왼쪽 숫자
		int rt = 0;//연산자 오른쪽 숫자
		
		for(int x:str.toCharArray()) {
			if(Character.isDigit(x)) {
				int n = (int)x-48;
				stack.push(n);
			}
			else {
				rt = stack.pop();
				lt = stack.pop();
				if((char)x == '+') stack.push(lt+rt);
				if((char)x == '-') stack.push(lt-rt);
				if((char)x == '*') stack.push(lt*rt);
				if((char)x == '/') stack.push(lt/rt);
			}
		}
		answer = stack.pop();
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
