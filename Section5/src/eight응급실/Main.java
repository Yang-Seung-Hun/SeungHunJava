package eight응급실;
//왜오답임
import java.util.Scanner;

public class Main {
	
	public int solution(int n, int m, int[] arr ) {
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			if(arr[i]>arr[m]) answer++;
		}
		for(int i=0; i<=m; i++) {
			if(arr[i] == arr[m]) answer++;
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
