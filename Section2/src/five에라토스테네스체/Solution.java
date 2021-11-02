package five에라토스테네스체;
//에라토스테네스테 => 처음 체크 베열은 모두 0임. 2부터 카운트 한 후 2의 배수식 인덱스 증가 시켜, 다 체크 배열1로 만들기.증가시키면서 체크배열 0이면 카운트 후 또 배수 해당되는곳 1로 바꾸기.계속 반복
import java.util.Scanner;

public class Solution {
	
public int solution(int n) {
		int answer=0;
		int[] ch = new int[n+1];
		for(int i=2; i<=n; i++) {
			if(ch[i]==0) {
				answer++;
				for(int j=i; j<=n; j=j+i) {
					ch[j] = 1;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		System.out.println(T.solution(n));

	}

}
