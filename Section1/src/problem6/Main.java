package problem6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		String answer = "";
		ArrayList<Character> list = new ArrayList<Character>();
		ArrayList<Character> list2 = new ArrayList<Character>();
		list2.add(' ');
		
		char[] s = str.toCharArray();
		for(char x : s) {
			list.add(x);
		}
		
		for(int i=0; i<list.size()-1; i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i) == list.get(j)) {
					list.remove(j);
					list.add(j, ' ');
				}
			}
		}
		list.removeAll(list2);
		for(char x : list) {
			 answer = answer + x;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

}
