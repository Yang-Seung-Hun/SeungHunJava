package problem10;

import java.util.Scanner;

public class Solution {
	
	public int[] solution(String str, char t) {
		int[] answer = new int[str.length()];
		
		//오른쪽으로 이동하면서 타겟 문자 만나면 p를 0으로 하고, 안만나면 1씩증가 => 왼쪽에있는 타겟과의 거리 구해짐
		int p = 1000;//기준 문자 왼쪽에 타겟문자 거리구하기
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == t) {
				p=0;
				answer[i] = p;
			}
			
			else {
				p++;
				answer[i] = p;
			}
		}
		
		//여기는 반복문 거꾸로해서 위와 반대쪽 타겟과의 거리 구하는 것
		p = 1000;//기준 문자 오른쪽에 타겟문자 거리구하기
		for(int i=str.length()-1; i>=0; i--)
		{
			if(str.charAt(i) == t) {
				p=0;
			}
			
			else {
				p++;
				answer[i] = Math.min(answer[i], p);//외쪽에 있는 타겟 문자와의 거리보다 작을때만	
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);//문자하개 읽기
		
		for(int x : T.solution(str,c)) {
			System.out.print(x+" ");
		}
	}

}
