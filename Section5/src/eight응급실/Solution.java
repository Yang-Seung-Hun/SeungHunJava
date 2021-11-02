package eight응급실;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{//환자의 위험도와, 대기 순서 같이 표현해주기 위해
	int id;
	int priority;
	public Person(int n, int priority) {
		this.id = n;
		this.priority = priority;
	}
}

public class Solution {
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Queue<Person> Q = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			Q.offer(new Person(i,arr[i]));
		}
		
		while(!Q.isEmpty()) {
			Person tmp = Q.poll();//큐에서 맨앞 사람 꺼냄
			for(Person x: Q) {//꺼낸 사람과 큐에 있는 위험도 비교
				if(x.priority>tmp.priority) {//큐에 더 위험도 높은 사람 있는 경우
					Q.offer(tmp);//맨뒤로 보냄
					tmp = null;
					break;
				}
			}
			if(tmp!=null) {
				answer++;
				if(tmp.id == m) return answer;
			}
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
