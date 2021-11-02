package problem5;

import java.util.Scanner;

public class Solution {
	
	public String solution(String str) {
		String answer = "";
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(s[lt])) {//s[lt]�� ���Ĺ� �ƴҶ� ��
				lt++;
			}
			else if(!Character.isAlphabetic(s[rt])) {//s[rt]�� ���ĺ� �ƴҶ�
				rt--;
			}
			else {//�Ѵ� ���ĺ�
				char tmp=s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);
		
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
