package ten마구간정하기_결정알고리즘;
//모르겠다....
//강의 설명 듣고 풀었음
//두 마구간의 최소 거리의 최댓값으로 가능한 수는 1부터 배열의 가장 큰 수 사이에 있다고 확실할 수 있음 => 결정알고리즘
//설정 범위에서 이분검색으로 범위 줄여나감
//해당 값이 가능한지 안한지 판단하는 함 수 만듬 => 배열의 처음 숫자와 각 배열의 차이가 mid보다 커야하고, 그 개수가 적어도 m보다는 크거나 같아야함
//중간에 answer가 되는 mid 중 배열의 간격들 중 mid가 안되는 것도 있지만, lt = answer+1; 요과정에서 커버가 되는 듯하다 (여기가 제일 이해 안가긴 함)

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public int count(int[] arr, int mid) {//mid가 답 후보 될 수 있는지 판별
		int cnt = 1;
		int ep = arr[0];
		for(int i=1; i<arr.length; i++) {
			if((arr[i]-ep) >= mid) {
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}
	
	public int solution(int n, int m, int arr[]) {
		int answer = 0;
		
		Arrays.sort(arr);
		int lt = 1;
		int rt = arr[n-1];
		
		while(lt<=rt) {
			int mid = (rt+lt)/2;
			if(count(arr,mid)>=m) {
				answer = mid;
				lt = answer+1;
			}
			
			else {
				rt = mid-1;
			}
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
