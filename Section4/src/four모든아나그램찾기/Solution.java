package four모든아나그램찾기;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	
	public int solution(String str, String str2) {
		int answer = 0;
		int lt = 0;
		HashMap<Character,Integer> am = new HashMap<>();//str2를 hashmap으로
		HashMap<Character,Integer> bm = new HashMap<>();//str의 hashmap
		
		for(int i=0; i<str2.length(); i++) {//일단 기준인 am을 초기화
			am.put(str2.charAt(i), am.getOrDefault(str2.charAt(i), 0)+1);
		}
	
		for(int i=0; i<str2.length()-1; i++) {//am의 크기보다 1작게 bm초기화
			bm.put(str.charAt(i), bm.getOrDefault(str.charAt(i), 0)+1);
		}
		
		for(int rt=str2.length()-1; rt<str.length();rt++) {
			bm.put(str.charAt(rt), bm.getOrDefault(str.charAt(rt), 0)+1);
			if(am.equals(bm)) answer++;//hashmap 비교할때는 equal쓰면 됨
			bm.put(str.charAt(lt), bm.get(str.charAt(lt))-1);
			if(bm.get(str.charAt(lt)) == 0) bm.remove(str.charAt(lt));
			lt++;
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		String str2 = kb.next();
		
		System.out.println(T.solution(str,str2));

	}

}
