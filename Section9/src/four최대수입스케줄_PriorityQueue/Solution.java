package four�ִ���Խ�����_PriorityQueue;

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
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());//����Ʈ�� ���� ���� �켱���� ���� ==> reverseOrder()������ ū���� �켱���� ����
		Collections.sort(arr);//��¥�� �������� �������� ����
		int j = 0;
		for(int i=max; i>=1; i--) {//������ ������ ������ ==> ���������� ������ ���� ����, ���������� 2��° �� ������ ���� ���� .... �̷� ����
			for(;j<n; j++) {
				if(arr.get(j).time<i) break;//���� �ٲ�� �ݺ��� Ż��
				pQ.offer(arr.get(j).money);//�켱���� ť�� �� �־���
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
