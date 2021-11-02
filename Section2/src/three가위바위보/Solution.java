package three가위바위보;

import java.util.Scanner;

public class Solution {
	
public String solution(int n, int[] a, int[] b) {
		String answer = "";
		for(int i=0; i<n; i++) {
			if(a[i] == b[i]) {//비길경우
				answer+="D";
			}
			else if(a[i] == 1 && b[i] ==3) {//가위로 이길경우
				answer+="A";
			}
			else if(a[i] == 2 && b[i] ==1) {//바위로 이길경우
				answer+="A";
			}
			else if(a[i] == 3 && b[i] ==2) {//보로 이길경우
				answer+="A";
			}
			else {//질경우
				answer+="B";
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = kb.nextInt();
		}
		for(int i=0; i<n; i++) {
			a[i] = kb.nextInt();
		}
	
		for(char x: T.solution(n, a, b).toCharArray()) {
			System.out.println(x);
		}
	}
}
