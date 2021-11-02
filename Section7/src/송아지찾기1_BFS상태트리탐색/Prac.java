package 송아지찾기1_BFS상태트리탐색;
//출제의도 : BFS사용해서 최소거리 찾기 + ch[]배열 사용해서 시간복잡도 줄이기  ====> ch[]배열 안쓰면 런타임 오류뜸
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Prac {
	
	int[] jump = {1,-1,5};
	int[] ch = new int[10001];
	
	public int solution(int s, int e){
		int answer = 1;
		
		Queue<Integer> Q = new LinkedList<>();
		Q.offer(s);
		ch[1] = 1;
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0; i<len; i++) {
				int tmp = Q.poll();
				for(int j = 0; j<3; j++) {
					int l = tmp+jump[j];
					if(l==e) return answer;
					else if(l>0 && l<=10000 && ch[l]==0) {
						ch[l] = 1;
						Q.offer(l);
					}
				}
			}
			answer++;
		}
		return answer;
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Prac T = new Prac();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int e = kb.nextInt();
		
		System.out.println(T.solution(s, e));
	}
}
