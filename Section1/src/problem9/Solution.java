package problem9;

import java.util.Scanner;

public class Solution {
	
//	public int solution(String str) {
//		int answer = 0;
//		for(char x : str.toCharArray()) {
//			if(x>=48 && x<=57) {//�ƽ�ũ��ȣ 48�� 0�� �ش� 57�� 9�� �ش�
//				answer = answer*10+(x-48);//(x-48)�� �ƽ�Ű��ȣ����ؼ� 
//			}
//		}
//		return answer;
//	}
	
	public int solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) {//Character.isDigit�� �������� ��������
				answer = answer+x;
			}
		}
		
		return Integer.parseInt(answer);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.println(T.solution(str));
	}

}
