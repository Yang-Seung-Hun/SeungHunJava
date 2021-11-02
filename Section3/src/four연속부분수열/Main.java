package four연속부분수열;
//정답처리는 됐는데 의도는 two pointer 알고리즘으로
import java.util.Scanner;

public class Main {
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			int subsum = 0;
			for(int j=i; j<n; j++) {
				subsum = subsum+arr[j];
				if(subsum == m) {
					answer++;
					break;
				}
				else if(subsum>m) {
					break;
				}
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
		
		System.out.println(T.solution(n,m,arr));

	}
}
