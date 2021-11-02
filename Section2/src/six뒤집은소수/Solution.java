package six뒤집은소수;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	
	public boolean isPrime(int num) {//소수 판별법
		if(num == 1) {
			return false;
		}
		
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
public ArrayList<Integer> solution(int[] arr, int n) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int tmp = arr[i];
			int res = 0;
			while(tmp>0) {//반복문 빠져나가는 조건 잘 생각하기 헷갈림
				int t = tmp%10;
				res = res*10+t;//나머지를 통해 갱신
				tmp = tmp/10;
			}
			if(isPrime(res)) {
				answer.add(res);
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
		
		for(int x:T.solution(arr, n)) {
			System.out.print(x+" ");
		}

	}

}
