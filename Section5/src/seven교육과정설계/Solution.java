package seven������������;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	
	public String solution(String str, String str2) {
		String answer = "YES";
		Queue<Character> Q = new LinkedList<>();
		
		for(char x:str.toCharArray())Q.offer(x);
		for(char x:str2.toCharArray()) {
			if(Q.contains(x)) {//�ʼ������̸�
				if(x!=Q.poll()) return "NO";//ť�� �տ��ִ��� Ȯ�� �ƴϸ� "NO"��ȯ
			}
			if(!Q.isEmpty()) return "NO";//�ʼ� ���� �� �ȵ� ���
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main  T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		String str2 = kb.next();
		
		System.out.println(T.solution(str, str2));

	}

}
