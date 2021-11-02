package two아나그램_해쉬;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public String solution(String s, String s2) {
		String answer = "YES";
		HashMap<Character,Integer> map = new HashMap<>();
		HashMap<Character,Integer> map2 = new HashMap<>();
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		for(char x : s2.toCharArray()) {
			map2.put(x, map2.getOrDefault(x, 0)+1);
		}
		
		for(char key : map.keySet()) {
			if(map.get(key) != map2.get(key)) return "NO";
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		String s2 = kb.next();
		System.out.println(T.solution(s,s2));
	}
}
