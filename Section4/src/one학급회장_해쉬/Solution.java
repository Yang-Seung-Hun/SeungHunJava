package one학급회장_해쉬;

import java.util.HashMap;
import java.util.Scanner;

//해쉬맵으로 풀라고 낸 문제임 
public class Solution {
	public char solution(int n, String str) {
		char answer = 0;
		int max = Integer.MIN_VALUE;
		HashMap<Character, Integer>map = new HashMap<>();
		for(char x:str.toCharArray()) {
			map.put(x, map.getOrDefault(x,0)+1);//map.getOrDefault는 map에 key x의 값이 있으면 value반환하고 아니면 0을 반환
		}
		//map 메소드 정리(참고용)
		//map.containsKey('*') : 키에 *가 존재하는지 안하는지
		//map.size() : key의 종류 개수 
		//map.remove('*') : *라는 키를 삭제(리턴 값은 *의 value)
		
		for(char key : map.keySet()) {//존재하는 키값 다 돌려보기
			//System.out.println(key+" "+map.get(key));
			if(map.get(key)>max) {
				max = map.get(key);
				answer = key;
			}
		}
		return answer;
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n,str));
	}

}
