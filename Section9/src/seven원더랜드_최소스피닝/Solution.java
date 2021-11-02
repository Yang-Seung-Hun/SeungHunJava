package seven원더랜드_최소스피닝;
//크루스칼
//풀이랑 비슷 함 ==> 간선 개수 이용해서 효율 높이는 부분 추가됨  *보통 간선 엄청 많이 주어지지 않는데 혹시 모르니 알고만 있자.
import java.util.*;
class Edge implements Comparable<Edge>{
    public int v1;
	public int v2;
	public int cost;
    Edge(int v1, int v2, int cost) {
        this.v1 = v1;
		this.v2 = v2;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge ob){
        return this.cost-ob.cost;
    }
}

public class Solution {
	static int[] unf;
	public static int Find(int v){
		if(v==unf[v]) return v;
		else return unf[v]=Find(unf[v]);
	}
	public static void Union(int a, int b){
		int fa=Find(a);
		int fb=Find(b);
		if(fa!=fb) unf[fa]=fb;
	}
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		unf=new int[n+1];
		ArrayList<Edge> arr=new ArrayList<>();
		for(int i=1; i<=n; i++) unf[i]=i;
		for(int i=0; i<m; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			int c=kb.nextInt();
			arr.add(new Edge(a, b, c));
		}
		int answer=0;
		Collections.sort(arr);
		for(Edge ob : arr){
			int cnt = 0;//간선 개수 용
			int fv1=Find(ob.v1);
			int fv2=Find(ob.v2);
			if(fv1!=fv2){
				answer+=ob.cost;
				Union(ob.v1, ob.v2);
				cnt++;
			}
			if(cnt == n-1) break;// 간선 개수가 n-1이여야함 ==> 굳이 반복문 계속 돌 필요x
		}
		System.out.println(answer);
	}
}
