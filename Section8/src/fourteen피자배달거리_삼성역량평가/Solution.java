package fourteen피자배달거리_삼성역량평가;
//출제의도 : DFS활용 조합을 이용해서 문제 풀기
//차근히 다시 풀어 보자
import java.util.ArrayList;
import java.util.Scanner;

class Point{
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Solution {
	static int n,m,len;
	static int answer = Integer.MAX_VALUE;
	static int[] combi;
	static ArrayList<Point> pz, hs;
	
	public void DFS(int L, int s) {//6개 피자 중에 4개 고르는 조합!!!! => 조합은 좀 외우자
		if(L==m) {//여기서 combi에 저장된 선택된 4개의 인덱스 사용 
			int sum = 0;
			for(int i=0; i<m; i++) System.out.print(combi[i]+" ");
			System.out.println();
			for(Point h : hs) {
				int dis = Integer.MAX_VALUE;
				for(int i:combi) {
					dis = Math.min(dis,Math.abs(h.x-pz.get(i).x)+Math.abs(h.y-pz.get(i).y));
				}
				sum+=dis;
			}
			answer = Math.min(answer, sum);
		}
		
		else {
			for(int i=s; i<len; i++) {
				combi[L] = i;
				DFS(L+1,i+1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pz = new ArrayList<>();
		hs = new ArrayList<>();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int tmp = kb.nextInt();
				if(tmp == 1) hs.add(new Point(i,j));
				else if(tmp == 2) pz.add(new Point(i,j));
			}
		}
		
		len = pz.size();
		combi = new int[m];
		T.DFS(0,0);
		System.out.println(answer);
		

	}

}
