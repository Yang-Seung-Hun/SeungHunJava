package two보이는학생;
//이중 반복문은 시간 너무 많이 씀!!! 이 방법 알아두기
import java.util.Scanner;

public class Solution {
	
public int solution(int[] arr, int n) {
		int answer = 1;//맨앞사람은 기본으로 보이니까
		int max = arr[0];//현재 인덱스까지의 최댓값 이거보다 커야만 보임!!
		
		for(int i=1; i<n; i++) {
			if(arr[i]>max) {
				answer++;
				max = arr[i];
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}

		System.out.println(T.solution(arr, n));
	}
}
