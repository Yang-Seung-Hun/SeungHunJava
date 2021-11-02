package fiveK��°ū��;
//TreeSet����ϸ� ��û ������(�ߺ����ſ� ����)
//TreeSet �߿� �޼ҵ� :
//TreeSet.remove(*) : *����
//TreeSet.size() : ������ ����
//TreeSet.first() : ���������̸� �ּڰ�, ���������̸� �ִ�(treeSet�� ó����)
//TreeSet.last() : TreeSet������ ���� �ް�(first�� �ݴ�)

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution {
	
	public int solution(int n, int k, int[] arr) {
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());//TreeSet�� �ߺ� ���� ������������ (Collections.reverseOrder()�� ��������)
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int l = j+1; l<n; l++) {
					Tset.add(arr[i]+arr[j]+arr[l]);//Tset�� �߰�����
				}
			}
		}
		int cnt = 0;
		for(int x:Tset) {
			cnt++;//cnt�� Tset�� ���°���� 
			if(cnt == k) return x; //Tset�� k��° ���
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n,k,arr));

	}

}
