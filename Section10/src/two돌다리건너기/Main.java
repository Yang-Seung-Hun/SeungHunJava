package two돌다리건너기;

import java.util.Scanner;

public class Main {
	static int[] dy;
	static int n;
	
	public int solution() {
		dy[1] = 1;
		dy[2] = 2;
		for(int i=3; i<=n+1; i++) {
			dy[i] = dy[i-2]+dy[i-1];
		}
		return dy[n+1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		dy = new int[n+2];
		System.out.println(T.solution());
	}
}
