package fourLeastRecentlyUser_카카오변형;
//배열로 풀기 => 삽입정렬 활용
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Practice {
	
	public Queue<Integer> solution(int s, int n, int[] arr) {
		Queue<Integer> Q = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			if(Q.contains(arr[i])) {//hit
				Q.remove(arr[i]);
				Q.offer(arr[i]);
			}
			
			else if(!Q.contains(arr[i]) && Q.size()<s) {
				Q.offer(arr[i]);
			}
			
			else{
				Q.poll();
				Q.offer(arr[i]);
			}
		}
		
		return Q;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Practice T = new Practice();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
	}

}
