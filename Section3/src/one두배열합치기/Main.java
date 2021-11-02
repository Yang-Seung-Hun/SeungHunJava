package one�ι迭��ġ��;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public ArrayList <Integer> solution(int n, int[] arr, int m, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			answer.add(arr[i]);
		}
		for(int i=0; i<m; i++) {
			answer.add(arr2[i]);
		}
		
		Collections.sort(answer);//�̰� �׳� ���� ���� �ٷ� answer ��ü�� �������ִ� ��
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
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
