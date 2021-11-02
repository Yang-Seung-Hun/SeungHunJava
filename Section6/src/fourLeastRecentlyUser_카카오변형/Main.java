package fourLeastRecentlyUser_카카오변형;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public String solution(int n, int m, int[] arr) {
		String answer ="";
		Queue<Integer> Q = new LinkedList<>();
		
		for(int i=0; i<m; i++) {
			if(Q.contains(arr[i]))Q.remove(arr[i]);
			Q.offer(arr[i]);
			if(Q.size()>n) Q.poll();
		}
		
		for(int i=0; i<n; i++) {
			answer =Q.poll()+" "+answer;
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[m];
		for(int i=0; i<m; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n, m, arr));
	}
}
