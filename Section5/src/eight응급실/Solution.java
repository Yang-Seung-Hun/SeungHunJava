package eight���޽�;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{//ȯ���� ���赵��, ��� ���� ���� ǥ�����ֱ� ����
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
			Person tmp = Q.poll();//ť���� �Ǿ� ��� ����
			for(Person x: Q) {//���� ����� ť�� �ִ� ���赵 ��
				if(x.priority>tmp.priority) {//ť�� �� ���赵 ���� ��� �ִ� ���
					Q.offer(tmp);//�ǵڷ� ����
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
