package problem7;

import java.util.Scanner;

public class Solution {
	
	public String solution(String str) {
//		String answer = "YES";
//		str = str.toUpperCase();//��ҹ��� ���� ����
//		int len = str.length();
//		for(int i=0; i<len/2; i++) {//������ ������ ��U���ܳ��� ���ϸ鼭 �Ǵ� 
//			if(str.charAt(i)!=str.charAt(len-i-1)) {
//				return "NO";//�ٸ��� ������ �ٷ� �ٸ��Ŵϱ� �ٷ� ���� �ع���
//			}
//		}
//		return answer;//������ �Ȱɷ����� �����Ŵϱ� ����
		
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) {//equalsIgnoreCase�� ��ҹ��� �������ϰ� ��
			answer = "YES";
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
