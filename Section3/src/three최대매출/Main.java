package three최대매출;
import java.util.Scanner;

public class Main {
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int subsum = 0;
		
		for(int i=0; i<m; i++) {
			subsum = subsum+arr[i];
			answer = subsum;//여기 조심!! 첨에 이거땜에 엄청 고민함 => 요게 없으면 처음3개가 최대값일때 고려 안하게 됨
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
