package problem8;

import java.util.Scanner;

public class Solution {
	
	public String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]","");//���Խ� ����ؼ� ���ĺ��ƴѰ� �� ���ڷ� replace��Ŵ(^�� �ƴ϶�� �� => A-Z���� ���ڸ� ""�� ġȯ�ض�)
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
