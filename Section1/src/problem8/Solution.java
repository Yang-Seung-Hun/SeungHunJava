package problem8;

import java.util.Scanner;

public class Solution {
	
	public String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]","");//정규식 사용해서 알파벳아닌거 다 빈문자로 replace시킴(^는 아니라는 뜻 => A-Z제외 문자를 ""로 치환해라)
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) {
			answer = "YES";
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
