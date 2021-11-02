package problem9;

import java.util.Scanner;

public class Solution {
	
//	public int solution(String str) {
//		int answer = 0;
//		for(char x : str.toCharArray()) {
//			if(x>=48 && x<=57) {//아스크번호 48은 0에 해당 57은 9에 해당
//				answer = answer*10+(x-48);//(x-48)은 아스키번호고려해서 
//			}
//		}
//		return answer;
//	}
	
	public int solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) {//Character.isDigit은 숫자인지 구별해줌
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
