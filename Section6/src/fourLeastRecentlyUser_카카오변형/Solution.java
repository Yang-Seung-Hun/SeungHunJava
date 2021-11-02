package fourLeastRecentlyUser_카카오변형;
//배열만으로 풀기!!!
import java.util.Scanner;

public class Solution {
	
	public int[] solution(int size, int n, int[] arr) {
		int[] cache = new int[size];
		for(int x: arr) {
			int pos = -1;//인덱스 번호
			for(int i = 0; i<size; i++) if(x==cache[i]) pos = i;//cache에 hit인지 miss일지 구별
			
			if(pos == -1) {//cache에 없을때(miss)
				for(int i=size-1; i>=1; i--) {
					cache[i] = cache[i-1];
				}
				cache[0] = x;
			}
			else {//hit일때
				for(int i=pos; i>=1; i--) {
					cache[i] = cache[i-1];
				}
				cache[0] = x;
			}
		}
		return cache;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		for(int x:T.solution(s,n,arr)) System.out.print(x+" ");

	}

}
