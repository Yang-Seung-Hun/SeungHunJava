package four연속된자연수의합;

import java.util.Scanner;

//첫번째 풀이는 내 풀이랑 같음
//두번째 풀이는 수학적으로
public class Solution {
	
	public int solution(int n) {
		int answer = 0;
		int cnt = 1;
		n--;
		while(n>0) {//연속된 수자 2개일 때 부터 순서대로 가능한지 구함
			cnt++;//연속된 자연수 개수
			n=n-cnt;//합에서 부족한 만큼이라고 생각하면 됨
			if(n%cnt==0) {//연속된 숫자1 2 3.... 순으로 배열후 부족한 합만큼 가각 더해주면 되는까 남은 합이 연속된 개수로 나누어 떨어지면 답임
				answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n= kb.nextInt();
		
		System.out.println(T.solution(n));

	}

}
