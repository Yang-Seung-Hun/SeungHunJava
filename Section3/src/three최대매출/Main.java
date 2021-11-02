package three�ִ����;
import java.util.Scanner;

public class Main {
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int subsum = 0;
		
		for(int i=0; i<m; i++) {
			subsum = subsum+arr[i];
			answer = subsum;//���� ����!! ÷�� �̰Ŷ��� ��û ����� => ��� ������ ó��3���� �ִ밪�϶� ��� ���ϰ� ��
		}
		
		for(int i=m; i<n; i++) {
			subsum = subsum+arr[i]-arr[i-m];
			if(subsum>answer) {
				answer = subsum;
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
