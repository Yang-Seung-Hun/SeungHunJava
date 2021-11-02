package problem7;

import java.util.Scanner;

public class Solution {
	
	public String solution(String str) {
//		String answer = "YES";
//		str = str.toUpperCase();//대소문자 구별 안함
//		int len = str.length();
//		for(int i=0; i<len/2; i++) {//반으로 나눠서 양쪾끝단끼리 비교하면서 판단 
//			if(str.charAt(i)!=str.charAt(len-i-1)) {
//				return "NO";//다른것 나오면 바로 다른거니까 바로 리턴 해버림
//			}
//		}
//		return answer;//위에서 안걸러지면 같은거니까 리턴
		
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) {//equalsIgnoreCase는 대소문자 구별안하고 비교
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
