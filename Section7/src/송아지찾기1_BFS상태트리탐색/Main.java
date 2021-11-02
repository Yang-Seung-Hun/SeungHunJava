package 송아지찾기1_BFS상태트리탐색;
//대략적인 방법은 찾았는데 코드를 생각 못했음
//많이 반복 해서 마스터 하자 !!!!!!!!
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	int answer = 0;
	int[] dis= {1,-1,5};//한점프에 갈 수있는 거리 수
	int[] ch;//체크 베열 =>이미 나온 거 거를 때 사용
	Queue<Integer> Q = new LinkedList<>();
	public int BFS(int s,int e) {
		ch = new int[10001];//문제에서 좌표가 1부터 10000이라고 함
		ch[s] = 1;//현수 위치가 s니까 일단 s는 체크
		Q.offer(s);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0; i<len; i++) {
				int x = Q.poll();
				if(x==e) return L;
				for(int j=0; j<3; j++) {
					int nx = x+dis[j];
					if(nx>=1 && nx<=10000 && ch[nx]==0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int e = kb.nextInt();
		System.out.println(T.BFS(s, e));
	}

}
