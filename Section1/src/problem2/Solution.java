package problem2;

import java.util.Scanner;

public class Solution {

	public String solution(String str) {
		String answer = "";
//		for (char x : str.toCharArray()) {
//			if(Character.isLowerCase(x)) {
//				answer+=Character.toUpperCase(x);
//			}
//			else {
//				answer+=Character.toLowerCase(x);
//			}
//		}
		
		//�ƽ�Ű��(�빮��:65-90/�ҹ���:97-122)
		for(char x : str.toCharArray()) {
			//�빮��
			if(x>=65 && x<90) {
				answer+=(char)(x+32);
			}
			
			else {
				answer+=(char)(x-32);
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
