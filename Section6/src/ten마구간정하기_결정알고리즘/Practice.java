package ten마구간정하기_결정알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
	
	public int filter(int mid, int[] arr) {
		Arrays.sort(arr);
		int cnt = 1;
		int cur = 1;
		
		for(int i=1; i<arr.length; i++) {
			if((arr[i] - cur) >= mid) {
				cnt++;
				cur = arr[i];
			}
		}
		return cnt;
	}
	
	
	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		int lt = 1;
		int rt = Arrays.stream(arr).max().getAsInt();
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			
			if(filter(mid,arr)>=c) {
				answer = mid;
				lt = mid+1;
			}
			
			else {
				rt = mid-1;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Practice T = new Practice();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int c = kb.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n, c, arr));

	}
}
