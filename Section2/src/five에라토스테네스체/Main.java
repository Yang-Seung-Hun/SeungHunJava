package five에라토스테네스체;
//시간초과함 (이중포문땜에) ㅜㅜ
import java.util.Scanner;

public class Main {
	
	public int solution(int n) {
		int answer = 1;
		for(int i=3; i<=n; i++) {
			int count =0;
			for(int j=2; j<i; j++) {
				if(i%j == 0){
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
		
		System.out.println(T.solution(n));
	}

}
