package one�ι迭��ġ��;

import java.util.ArrayList;
import java.util.Scanner;

//�迭 ���ļ� ���� ���� two pointers algorithm!!!!!
//�� �迭�� ����Ű�� ������(�ε���) ���� ����(p1,p2) 
//�� �迭�� p1,p2���� �� ���� ū ���� ���� answer�� ���, �ش� ������ 1����
public class Solution {
	
	public ArrayList<Integer> solution(int n, int[] arr, int m, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0;
		int p2=0;
		
		while(p1<n && p2<m) {//���� �ϳ��� ���� ����� ���ǹ��� ���
			if(arr[p1] < arr2[p2]) {
				answer.add(arr[p1]);
				p1++;
			}
			else {
				answer.add(arr2[p2]);
				p2++;
			}
		}
		
		while(p1<n) answer.add(arr[p1++]);//�迭 �� ��� ���� �ִ� �迭 �𸣴ϱ�
		while(p2<m) answer.add(arr2[p2++]);//�ΰ��� ���� �޾� ��
		
		return answer;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		int m = kb.nextInt();
		int[] arr2 = new int[m];
		for(int i=0; i<m; i++) {
			arr2[i] = kb.nextInt();
		}
		
		for(int x: T.solution(n, arr, m, arr2)) {
			System.out.print(x+" ");
		}

	}

}
