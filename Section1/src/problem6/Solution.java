package problem6;

import java.util.Scanner;

public class Solution {
	
	public String solution(String str) {
		String answer = "";
		for(int i=0; i<str.length(); i++) {
			//indexof�� ���ʳ��� ������ �ε����� �˷��� 
			if(str.indexOf(str.charAt(i)) == i) {//ó���߰ߵ� �ε����� ���� �ε��� ������ =>�ߺ��ȵȰ�
				answer += str.charAt(i);
			}
			
		}
		
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
