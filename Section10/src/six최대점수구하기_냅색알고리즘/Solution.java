package six최대점수구하기_냅색알고리즘;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Problem{
	int score;
	int time;
	public Problem(int score, int time) {
		this.score = score;
		this.time = time;
	}
	
	
}

//냅색에서 주어진개 한개씩일때는(여기서는 한문제씩) 문한개씩 주어졌을 때랑 반대방향으로 진행해야함
public class Solution {
	static int[] arr;
	static int n,m;
	static ArrayList<Problem> problems = new ArrayList<>();
	
	public void solution() {
		
		for(Problem x: problems) {
			for(int i=m; i>=0; i--) {
				if(i-x.time>=0) arr[i] = Math.max(arr[i-x.time]+x.score,arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[m+1];
		for(int i=0; i<n; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			problems.add(new Problem(a,b));
		}
		Arrays.fill(arr, 0);
		T.solution();
		System.out.println(arr[m]);
	}
}
