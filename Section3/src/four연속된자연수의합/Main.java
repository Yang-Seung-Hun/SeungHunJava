package four���ӵ��ڿ�������;
//3(�ִ����)���� �ַ���̶� ���� ������� Ǯ����!!! => �������ϱ�
import java.util.Scanner;

public class Main {
	
	public int solution(int n) {
		int answer = 0;
		int lt = 0;
		int sum = 0;
		int[] arr = new int[(n/2)+1];
		for(int i=0; i<(n/2)+1; i++) {
			arr[i] = i+1;
		}
	
		for(int rt = 0; rt<(n/2)+1; rt++) {
			sum = sum+arr[rt];
			if(sum == n) {
				answer++;
			}
			while(sum>=n) {
				sum = sum-arr[lt++];
				if(sum == n) {
					answer++;
				}
			}
		}
			
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n= kb.nextInt();
		
		System.out.println(T.solution(n));
	}
}
