package two�Ƴ��׷�_�ؽ�;

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
			if(!map.containsKey(x)||map.get(x) == 0) return "NO";//Ű���� ���ϸ� �ٷ� �ƴ϶�� �Ǵ��� �� ���� ���� �ش� key�� ������ value�� 0�̶�� ���� ������ �ٸ��ٴ� ��(���� �� ���������� �ϳ��� ���� �ϴϱ�)
			map.put(x, map.get(x)-1);//�ش� Ű�� �����ϰ� �� ���� 0�� �ƴѰ�� 1�����ҽ�Ŵ
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
