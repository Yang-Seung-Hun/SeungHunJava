package four최대수입스케줄_PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture>{
	int money;
	int time;
	Lecture(int money, int time){
		this.money = money;
		this.time = time;
	}
	@Override
	public int compareTo(Lecture o) {
		// TODO Auto-generated method stub
		return o.time-this.time;
	}
}

public class Solution {
	static int n;
	static int max = Integer.MIN_VALUE;
	
	public int solution(ArrayList<Lecture> arr) {
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());//디폴트는 작은 값이 우선순위 높음 ==> reverseOrder()있으면 큰값이 우선순위 높음
		Collections.sort(arr);//날짜를 기준으로 내림차순 정렬
		int j = 0;
		for(int i=max; i>=1; i--) {//마지막 날부터 앞으로 ==> 마지막날에 가능한 강의 고르고, 마지막에서 2번째 때 가능한 강의 고르고 .... 이런 순서
			for(;j<n; j++) {
				if(arr.get(j).time<i) break;//날이 바뀌면 반복문 탈출
				pQ.offer(arr.get(j).money);//우선순위 큐에 돈 넣어줌
			}
			if(!pQ.isEmpty()) answer+=pQ.poll();
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		ArrayList<Lecture> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int m = kb.nextInt();
			int d = kb.nextInt();
			arr.add(new Lecture(m,d));
			if(d>max) max = d;
		}
		System.out.println(T.solution(arr));
	}

}
