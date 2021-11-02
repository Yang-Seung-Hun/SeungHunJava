package eleven미로의최단거리통로_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class P{
	int x;
	int y;
	
	public P(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	
	static int[][] arr = new int[8][8];
	
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {-1, 0, 1, 0};
	
	public int BFS(P p) {
		
		Queue<P> Q = new LinkedList<>();
		Q.offer(p);
		int L = 1;
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0; i<len; i++) {
				P tmp = Q.poll();
				for(int j=0; j<4; j++) {
					int nx = tmp.x+dx[j];
					int ny = tmp.y+dy[j];
					if(nx==7 && ny==7) {
						return L;
					}
					
					if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && arr[ny][nx]==0) {
						arr[ny][nx] = 1;
						P np = new P(nx, ny);
						Q.offer(np);
					}
				}
			}
			L++;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		for(int i=1; i<8; i++) {
			for(int j=1; j<8; j++) {
				arr[i][j] = kb.nextInt();
			}		
		}
		
		arr[1][1] = 1;
		System.out.println(T.BFS(new P(1,1)));
	}
}
