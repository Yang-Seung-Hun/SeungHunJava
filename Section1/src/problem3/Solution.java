package problem3;

import java.util.Scanner;

public class Solution {
	
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE;//������ �ּҰ�
//		String[] s = str.split(" ");
//		for(String x : s) {
//			int len = x.length();
//			if(len>m) {
//				m=len;
//				answer = x;
//			}
//		}
		
		//�ε�����
		int pos;
		//�پ�� �߰��ϸ� ���ε��� ����, ���ϸ� -1����
		while((pos=str.indexOf(' '))!=-1) {
			String tmp = str.substring(0,pos);//ó������ �پ��������
			int len = tmp.length();
			if(len>m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos+1);//�پ��������� ����������
		}
		if(str.length()>m) {//�������ܾ�� �ڿ� �پ�� �����ϱ� ���� ó��
			answer = str;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));

	}

}
