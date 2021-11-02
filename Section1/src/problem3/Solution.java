package problem3;

import java.util.Scanner;

public class Solution {
	
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE;//정수중 최소값
//		String[] s = str.split(" ");
//		for(String x : s) {
//			int len = x.length();
//			if(len>m) {
//				m=len;
//				answer = x;
//			}
//		}
		
		//인덱스로
		int pos;
		//뛰어쓰기 발견하면 그인덱스 리턴, 못하면 -1리턴
		while((pos=str.indexOf(' '))!=-1) {
			String tmp = str.substring(0,pos);//처음부터 뛰어쓰기전까지
			int len = tmp.length();
			if(len>m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos+1);//뛰어쓰기다음부터 마지막까지
		}
		if(str.length()>m) {//마지막단어는 뒤에 뛰어쓰기 없으니까 따로 처리
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
