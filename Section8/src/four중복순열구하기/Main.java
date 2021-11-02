package four중복순열구하기;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//1부터 n까지 번호가 적힌 구슬이 있습니다. 
//이 중 중복을 허락하여 M번을 뽑아 일렬로 나열하는 방법을 모두 출력합니다.

//입력 설명: 첫 번째 줄에 자연수 N(3<=N<=10) 과 M(2<=M<=N) 이 주어집니다.
//출력 설명: 첫 번째 줄에 결과를 출력합니다. 출력순서는 사전순으로 오름차순으로 출력합니다.


//입력 예제 : 3 2
//출력 예제 : 
//1 1
//1 2
//1 3
//2 1
//2 2
//2 3
//3 1
//3 2
//3 3

public class Main {
	
	static int n;
	static int m;
	static Queue<String> Q;
	
	public void BFS(String str) {
		Q = new LinkedList<>();
		Q.offer(str);
		int L = 0;
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0; i<len; i++) {
				String tmp = Q.poll();
				for(int j=1; j<=n; j++) {
					if(tmp == "0") Q.offer(String.valueOf(j));
					else Q.offer(tmp+" "+String.valueOf(j));
				}
			}
			L++;
			if(L==m) return;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		
		T.BFS("0");
		for(String x:Q) {
			System.out.println(x);
		}
	}
}
