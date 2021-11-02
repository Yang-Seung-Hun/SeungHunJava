package two보이는학생;
//시간초과로 틀림 ㅜㅜ 
import java.util.Scanner;

public class Main {
	
	public int solution(int[] heights, int n) {
		int answer = 1;

		for(int i=1; i<n; i++)
		{
			int count = 0;
			for(int j=0; j<i; j++) {
				if(heights[i] <= heights[j]) {
					count++;
				}
			}
			
			if(count == 0) {
				answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] heights = new int[n];
		
		for(int i=0; i<n; i++) {
			heights[i] = kb.nextInt();
		}		
		System.out.println(T.solution(heights, n));	
	}

}
