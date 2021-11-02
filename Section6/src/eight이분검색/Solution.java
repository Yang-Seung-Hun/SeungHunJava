package eight이분검색;

import java.util.Arrays;
import java.util.Scanner;

//이분검색 (binary search)
//이분검색은 일다 정렬상태여야 함
//내풀이랑 방향 똑같음 반씩 짤라서 줄여나가기
public class Solution {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 0, rt=n-1;
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(arr[mid] == m) {
				answer = mid+1;
				break;
			}
			
			if(arr[mid]>m) rt = mid-1;
			else lt = mid+1;
		}
		return answer;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, m, arr));

	}

}
