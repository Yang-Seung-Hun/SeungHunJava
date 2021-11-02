package one학급회장_해쉬;

import java.util.Scanner;

public class Main {
	
	public char solution(int n, String str) {
		char answer = 0;
		char[] name = {'A','B','C','D','E'};
		int[] cnt = {0,0,0,0,0};
		
		for(int i=0; i<n; i++) {
			if(str.charAt(i) == 'A') cnt[0]++;
			if(str.charAt(i) == 'B') cnt[1]++;
			if(str.charAt(i) == 'C') cnt[2]++;
			if(str.charAt(i) == 'D') cnt[3]++;
			if(str.charAt(i) == 'E') cnt[4]++;
		}
		
		int max=0;
		int maxid=0;
		for(int i=0; i<5; i++) {
			if(cnt[i]>max) {
				max = cnt[i];
			    maxid = i;
			}
		}
		
		answer = name[maxid];
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n,str));
	}

}
