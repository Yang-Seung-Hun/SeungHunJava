package seven조합의경우수_메모리제이션;
//답은 맞았는데 성능 향사시키기 위해 메모리제이션 쓰기 => 이차원 배열 사용
import java.util.Scanner;

public class Main {
	
	static int[][] ch = new int[35][35];
	
	public int DFS(int n, int r) {
		if(ch[n][r]>0) return ch[n][r];//여기가 핵심 
		if(r == 0) return 1;
		if(n == r) return 1;
		
		else return ch[n][r] = DFS(n-1,r-1)+DFS(n-1,r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int r = kb.nextInt();
		System.out.println(T.DFS(n, r));

	}
}
