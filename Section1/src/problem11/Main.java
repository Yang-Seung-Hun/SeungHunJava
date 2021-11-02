package problem11;

import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		String answer = "";
		
		str = str+'#';//마지막에 무조건 달라야 끝나니까 임의로 특수문자 넣음
		int count = 1;//반복횟수
		for(int i=0; i<str.length()-1; i++)
		{
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			}
			
			else {
				if(count == 1) {
					answer = answer+str.charAt(i);
				}
				
				else if(count > 1) {
					answer = answer+str.charAt(i)+count;
					count = 1;
				}
			}
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
