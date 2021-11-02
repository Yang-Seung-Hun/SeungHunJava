package ten���������ϱ�_�����˰���;
//�𸣰ڴ�....
//���� ���� ��� Ǯ����
//�� �������� �ּ� �Ÿ��� �ִ����� ������ ���� 1���� �迭�� ���� ū �� ���̿� �ִٰ� Ȯ���� �� ���� => �����˰���
//���� �������� �̺а˻����� ���� �ٿ�����
//�ش� ���� �������� ������ �Ǵ��ϴ� �� �� ���� => �迭�� ó�� ���ڿ� �� �迭�� ���̰� mid���� Ŀ���ϰ�, �� ������ ��� m���ٴ� ũ�ų� ���ƾ���
//�߰��� answer�� �Ǵ� mid �� �迭�� ���ݵ� �� mid�� �ȵǴ� �͵� ������, lt = answer+1; ��������� Ŀ���� �Ǵ� ���ϴ� (���Ⱑ ���� ���� �Ȱ��� ��)

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public int count(int[] arr, int mid) {//mid�� �� �ĺ� �� �� �ִ��� �Ǻ�
		int cnt = 1;
		int ep = arr[0];
		for(int i=1; i<arr.length; i++) {
			if((arr[i]-ep) >= mid) {
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}
	
	public int solution(int n, int m, int arr[]) {
		int answer = 0;
		
		Arrays.sort(arr);
		int lt = 1;
		int rt = arr[n-1];
		
		while(lt<=rt) {
			int mid = (rt+lt)/2;
			if(count(arr,mid)>=m) {
				answer = mid;
				lt = answer+1;
			}
			
			else {
				rt = mid-1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
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
