package problem1;

import java.util.Scanner;

public class Main {
	
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();//���ڿ��� �� �빮��
		t = Character.toUpperCase(t);//�����ϳ��� �빮��
		
		//���� for������
		for(char x : str.toCharArray()) {
			if(x == t)
			{
				answer++;
			}
		}
		
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i) == t) {
//				answer++;
//			}
//		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);//���ڿ����� 0��° ����
		System.out.println(T.solution(str, c));
	}
}
