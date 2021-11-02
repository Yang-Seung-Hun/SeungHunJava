package five������ȯ_�����˰���;
//���� bfs�� Ǯ����
//answer(level) �ö󰡴°� ���� �򰥸�
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int n,m;
	static int[] coins;
	static int[] ch;
	
	public int solution(){
		
		Queue<Integer> q = new LinkedList<>();
		int answer = 1;
		for(int i=0; i<n; i++) {
			q.offer(coins[i]);
		}
		
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i=0; i<len; i++) {
				int tmp = q.poll();
				for(int j=0; j<n; j++) {
					int cur = tmp+coins[j];
					if(cur == m) return ++answer;//���� �� ++answer����.......
					if(cur<=m&&ch[cur] ==0) {
						ch[cur] = 1;
						q.offer(cur);
					}
				}
			}	
			answer++;
		}
		return 0;
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Main T =new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		coins = new int[n];
		for(int i=0; i<n; i++) {
			coins[i] = kb.nextInt();
		}
		m = kb.nextInt();
		ch = new int[m+1];
		System.out.println(T.solution());
	}
}
