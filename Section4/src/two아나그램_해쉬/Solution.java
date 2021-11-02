package two아나그램_해쉬;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	
	public String solution(String s, String s2) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x:s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		for(char x:s2.toCharArray()) {
			if(!map.containsKey(x)||map.get(x) == 0) return "NO";//키존재 안하면 바로 아니라고 판단할 수 있음 또한 해당 key가 있지만 value가 0이라는 것은 개수가 다르다는 뜻(같은 거 있을때마다 하나씩 감소 하니까)
			map.put(x, map.get(x)-1);//해당 키가 존재하고 그 값이 0이 아닌경우 1씩감소시킴
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		String s2 = kb.next();
		System.out.println(T.solution(s,s2));

	}

}
