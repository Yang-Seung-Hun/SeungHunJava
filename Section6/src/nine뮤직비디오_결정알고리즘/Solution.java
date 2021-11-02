package nine뮤직비디오_결정알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	public int count(int[] arr, int capacity) {//dvd 몇장으로 가능한지
		int cnt=1;
		int sum=0;
		
		for(int x:arr) {
			if(sum+x > capacity) {
				cnt++;
				sum = x;
			}
			else sum+=x;
		}
		
		return cnt;
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer =0;
		int lt = Arrays.stream(arr).max().getAsInt();//stream은 반복자라고 생각하자 => max는 돌면서 최댓값 찾아줌 stream쓰면 값이 int가 아니라 optionalint가 됨 => getAsInt써서 int로 바꿈
		int rt = Arrays.stream(arr).sum();//sum()은 기본형 int를 반환함 =>getAsInt()필요 없음 (stream은 한번 찾아보자 여러가지 기능이 있음!!!!)
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(arr,mid)<=m) {//m장 이하로 필요하면 당연히 m장으로도 만들 수 있음
				answer = mid;
				rt = mid-1;
			}
			else lt = mid+1;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
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
