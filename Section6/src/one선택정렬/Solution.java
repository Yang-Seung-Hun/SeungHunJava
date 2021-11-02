package one선택정렬;
//선택 정렬 알고리즘
import java.util.Scanner;

public class Solution {
	
	public int[] solution(int n, int[] arr) {
		for(int i=0; i<n-1; i++) {
			int idx = i;//가장 작은 값의 인덱스 설정
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[idx]) idx = j;
			}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		return arr;
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
		
		for(int x:T.solution(n, arr)) {
			System.out.print(x+" ");
		}

	}

}
