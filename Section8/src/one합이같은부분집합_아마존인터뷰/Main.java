package one합이같은부분집합_아마존인터뷰;
//처음에 배열 합의 2를 나눈 값을 기준으로 조건문 작성 했는데, 이렇게 되면 합이 홀수 일때 이상해짐 ex)12.5가 12가 되니까
//ch의 크기도 집합의 원소 수가 아니라 집합의 원소중 가장 큰 값으로 해야함
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
