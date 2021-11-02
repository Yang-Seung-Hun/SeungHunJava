package problem2;

import java.util.Scanner;

public class Main {

	public String solution(String str) {
		String answer = null;
		StringBuilder sb = new StringBuilder();
		
		for(char x : str.toCharArray()) {
			if(Character.isUpperCase(x))
			{
				x = Character.toLowerCase(x);
				sb.append(x);
			}
			
			else if(Character.isLowerCase(x))
			{
				x = Character.toUpperCase(x);
				sb.append(x);
			}
		}
		answer = sb.toString();
		return answer;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner input = new Scanner(System.in);
		String str = input.next();
	
		System.out.println(T.solution(str));
	}

}
