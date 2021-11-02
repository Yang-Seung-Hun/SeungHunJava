package one���̰����κ�����_�Ƹ������ͺ�;
//ó���� �迭 ���� 2�� ���� ���� �������� ���ǹ� �ۼ� �ߴµ�, �̷��� �Ǹ� ���� Ȧ�� �϶� �̻����� ex)12.5�� 12�� �Ǵϱ�
//ch�� ũ�⵵ ������ ���� ���� �ƴ϶� ������ ������ ���� ū ������ �ؾ���
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] ch;
	static int[] arr;
	static int n;
	static int total;
	static String answer;
	
	
	public void DFS(int idx) {
		
		if(idx == n+1) {
			int sum = 0;
			for(int i=1; i<ch.length; i++) {
				if(ch[i] ==1) sum = sum+i;
			}
			if(total == 2*sum) answer = "YES"; 
		}
		
		else {
			int val = arr[idx];
			ch[val] = 1;
			DFS(idx+1);
			ch[val] = 0;
			DFS(idx+1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		arr = new int[n+2];
		for(int i=1; i<=n; i++) {
			arr[i] = kb.nextInt();
		}
		
		total =( Arrays.stream(arr).sum());
		answer = "NO";
		ch = new int[Arrays.stream(arr).max().getAsInt()+1];
		
		T.DFS(1);
		
		System.out.println(answer);
	}
}
