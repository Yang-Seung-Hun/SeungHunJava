package problem12;

import java.util.Scanner;

public class Solution {
	
	public String solution(String str, int n) {
		String answer = "";
		for(int i=0; i<n; i++) {
			String tmp = str.substring(0,7).replace('#','1').replace('*', '0');
			int num = Integer.parseInt(tmp,2);
			answer = answer+(char)num;
			str = str.substring(7);//7부터 끝까지로  갱신해야함 
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		
		System.out.println(T.solution(str,n));
	}

}
