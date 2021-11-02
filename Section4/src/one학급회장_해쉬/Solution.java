package one�б�ȸ��_�ؽ�;

import java.util.HashMap;
import java.util.Scanner;

//�ؽ������� Ǯ��� �� ������ 
public class Solution {
	public char solution(int n, String str) {
		char answer = 0;
		int max = Integer.MIN_VALUE;
		HashMap<Character, Integer>map = new HashMap<>();
		for(char x:str.toCharArray()) {
			map.put(x, map.getOrDefault(x,0)+1);//map.getOrDefault�� map�� key x�� ���� ������ value��ȯ�ϰ� �ƴϸ� 0�� ��ȯ
		}
		//map �޼ҵ� ����(�����)
		//map.containsKey('*') : Ű�� *�� �����ϴ��� ���ϴ���
		//map.size() : key�� ���� ���� 
		//map.remove('*') : *��� Ű�� ����(���� ���� *�� value)
		
		for(char key : map.keySet()) {//�����ϴ� Ű�� �� ��������
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
