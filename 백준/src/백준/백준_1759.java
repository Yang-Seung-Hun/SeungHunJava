package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_1759 {
	static char[] chars;
	static int l,c;
	static char[] answer;
	
	public int vowels(char[] ans) {
		int cnt=0;
		for(int i=0; i<ans.length;i++) {
			if(ans[i] == 'a' || ans[i] == 'e' || ans[i] == 'i' || ans[i] == 'o' || ans[i] == 'u' ) cnt++;
		}
		return cnt;
	}
	
	public void DFS(int L, int f) {
		if(L == l && vowels(answer) >=1 && (l-vowels(answer)) >=2) {
			for(char x: answer)System.out.print(x);
			System.out.println();
			return;
		}
		
		else if(L<l) {
			for(int i = f; i<c; i++) {
				answer[L] = chars[i];
				DFS(L+1, i+1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		백준_1759 T = new 백준_1759();
		Scanner kb = new Scanner(System.in);
		l = kb.nextInt();
		c = kb.nextInt();
		chars = new char[c];
		answer = new char[l];
		kb.nextLine();
		String str = kb.nextLine();
	
		str = str.replace(" ", "");
		for(int i=0; i<c; i++) {
			chars[i] = str.charAt(i);
		}
		Arrays.sort(chars);
		T.DFS(0, 0);
	}
}
