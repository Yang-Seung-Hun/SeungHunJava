package one씨름선수;
//포괄적으로는 greedy 기법임
//키로 내림차순으로 배열 후, 몸무게로 조지기

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body>{
	
	public int h,w;
	Body(int h, int w){
		this.h = h;
		this.w = w;
	}

	@Override
	public int compareTo(Body o) {
		// TODO Auto-generated method stub
		return o.h-this.h;//h기준으로 내림차순
	}
	
}

public class Solution {
	
	public int solution(ArrayList<Body> arr, int n) {
		int cnt = 0;
		Collections.sort(arr);
		int max= Integer.MIN_VALUE;
		for(Body ob : arr) {
			if(ob.w>max) {
				max=ob.w;
				cnt++;
			}
		}
		return cnt;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Body> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int h = kb.nextInt();
			int w = kb.nextInt();
			arr.add(new Body(h,w));
		}
			System.out.println(T.solution(arr,n));
	}

}
