package problem4;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
//		for(String x : str) {
//			String tmp = new StringBuilder(x).reverse().toString();//x를 뒤집 stringbuilder는 새로운 객체 생성하는게 아니라 메모리 효율 좋음
//			answer.add(tmp);//ArrayList에 담음
//		}
		
		// ***************이개념 중요!!!!*******************
		for(String x : str) {
			char[] s=x.toCharArray();
			int lt = 0; //배열의 왼쪽끝 인덱스
			int rt = x.length()-1;//배열의 오른쪽끝 인덱스
			while(lt<rt) {//lt,rt를 중앙으로 몰면서 순서 역전될때까지 둘이 바꿈
				char tmp=s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);//문자배열을 문자열로 바꿈
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
