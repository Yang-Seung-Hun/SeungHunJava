package nine�������ִ���;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public int solution(int[][] arr2 ,int n) {
		
		ArrayList<Integer> list = new ArrayList<>();
		int answer = 0;
		int sum =0;
		
		for(int i=0; i<n; i++) {//���������� �Ʒ��� �밢��
			sum = sum + arr2[i][i];
		}
		list.add(sum);
		
		sum = 0;
		for(int i =0; i<n; i++) {//������������ �Ʒ��� �밢��
			sum = sum +arr2[i][n-i-1];
		}
		list.add(sum);
		
		for(int i=0; i<n; i++) {
			sum = 0;
			for(int j=0; j<n; j++) {
				sum = sum + arr2[i][j];
			}
			list.add(sum);//��� �� ����Ʈ�� �߰�
			
			sum = 0;
			for(int j=0; j<n; j++) {
				sum = sum + arr2[j][i];
			}
			list.add(sum);//���� �� ����Ʈ�� �߰�
		}
		
		answer = Collections.max(list);
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr2 = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr2[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(T.solution(arr2, n));

	}
}
