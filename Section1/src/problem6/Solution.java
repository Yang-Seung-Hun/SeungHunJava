package problem6;

import java.util.Scanner;

public class Solution {
	
	public String solution(String str) {
		String answer = "";
		for(int i=0; i<str.length(); i++) {
			//indexof는 최초나온 문자의 인덱스를 알려줌 
			if(str.indexOf(str.charAt(i)) == i) {//처음발견된 인덱스랑 실제 인덱스 같을때 =>중복안된것
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
