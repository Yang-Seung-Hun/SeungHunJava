package problem12;

import java.util.Scanner;
//# -> 1, * -> 0 7�ڸ�
public class Main {
	
	public String solution(String str, int n) {
		String answer = "";
		String[] subs = new String[n];
		
		str = str.replace('#', '1');
		str = str.replace('*', '0');
		for(int i=0; i<n; i++) {
			subs[i] = str.substring(i*7, 7*i+7);//7���� ����
		}
		
		for(int i=0; i<subs.length; i++) {
			answer = answer + (char)Integer.parseInt(subs[i],2);//���������ڿ��� ������������ ������ ���ڷ� ĳ����
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(str,n));
	}
}
