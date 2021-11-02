package four�����Ŀ���_postfix;
//�𸣰ڴ�...
//���� ũ�� ���� ��� ������ Ǯ����
//���ڿ� Ž���ϸ鼭 �����̸� stack�� ��� �����ڸ� stack���� pop�� ���� pop�Ѱ� �������� ���������� ���� ���߿� ������ �������� �������ΰ��� �� �׸��� ���� ����� ���ؿ� Ǫ����
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		int lt = 0;//������ ���� ����
		int rt = 0;//������ ������ ����
		
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
