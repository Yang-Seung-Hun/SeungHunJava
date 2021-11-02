package problem4;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
//		for(String x : str) {
//			String tmp = new StringBuilder(x).reverse().toString();//x�� ���� stringbuilder�� ���ο� ��ü �����ϴ°� �ƴ϶� �޸� ȿ�� ����
//			answer.add(tmp);//ArrayList�� ����
//		}
		
		// ***************�̰��� �߿�!!!!*******************
		for(String x : str) {
			char[] s=x.toCharArray();
			int lt = 0; //�迭�� ���ʳ� �ε���
			int rt = x.length()-1;//�迭�� �����ʳ� �ε���
			while(lt<rt) {//lt,rt�� �߾����� ���鼭 ���� �����ɶ����� ���� �ٲ�
				char tmp=s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);//���ڹ迭�� ���ڿ��� �ٲ�
			answer.add(tmp);
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = kb.next();
		}
		for(String x : T.solution(n,str))
		{
			System.out.println(x);
		}
	}

}
