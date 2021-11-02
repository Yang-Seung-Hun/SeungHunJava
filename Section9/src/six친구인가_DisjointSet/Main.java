package six친구인가_DisjointSet;
//나름 DFS로 풀려고 했는데 완전 틀림 모르겠다.............
//해설 보니까 개어려움 다시 보고 다시 많이 풀고 암기 할거 암기하지
//union,find 함수 부분은 암기하자
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<ArrayList<Integer>> list;
	static int f1,f2;
	static int cnt;
	
	public void solution(int f1) {
		
		if(f1 == f2) {
			cnt++;
			return;
		}
		
		else {
			for(int i=0; i<list.get(f1).size(); i++) {
				solution(list.get(f1).get(i));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		list = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			list.add(new ArrayList<Integer>());
		}
		for(int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			list.get(a).add(b);
		}
		f1 = kb.nextInt();
		f2 = kb.nextInt();
		
		T.solution(f1);
		if(cnt>0) System.out.println("YES");
		else System.out.println("NO");
	}
}
