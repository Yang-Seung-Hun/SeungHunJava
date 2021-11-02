package seven원더랜드_최소스피닝;
//어려워 ㅜㅜ
//설명 듣고 풀었음.....
//그리디 알고리즘 + unio,find 활용 ==>크루스칼 알고리즘
//프림 알고리즘 풀이도 있음 ==> 우선순위 큐 활용
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class EI implements Comparable<EI>{
	int v1;
	int v2;
	int cost;
	public EI(int v1, int v2, int cost) {
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}
	@Override
	public int compareTo(EI o) {
		// TODO Auto-generated method stub
		return this.cost - o.cost;
	}
}

public class Main {
	static ArrayList<EI> graph;
	static int[] unf;
	static int answer = 0;
	
	public int Find(int v){
		if(v==unf[v]) return v;
		else return unf[v]=Find(unf[v]);
	}
	
	public void Union(int a, int b){
		int fa=Find(a);
		int fb=Find(b);
		if(fa!=fb) unf[fa]=fb;
	}
	
	public void solution() {
		for(EI x:graph) {
			if(Find(x.v1) != Find(x.v2)) {
				answer = answer+x.cost;
				Union(x.v1,x.v2);
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		graph = new ArrayList<>();
		unf = new int[n+1];
		for(int i=1; i<=n; i++) {
			unf[i] = i;
		}
		for(int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.add(new EI(a,b,c));
		}
		Collections.sort(graph);	
		T.solution();
		System.out.println(answer);
	}
}
