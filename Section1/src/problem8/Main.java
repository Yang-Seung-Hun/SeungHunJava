package problem8;

import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		String answer = "YES";
		char c[] = str.toCharArray();
		int lt = 0;
		int rt = c.length-1;
		
		while(lt<rt) {
			if(!Character.isAlphabetic(c[lt])) {
				lt++;
			}
			
			else if(!Character.isAlphabetic(c[rt])) {
				rt--;
			}
			
			else {
				c[lt] = Character.toUpperCase(c[lt]);
				c[rt] = Character.toUpperCase(c[rt]);
				if(c[lt] != c[rt]) {
					return "NO";
				}
				
				else {
					rt--;
					lt++;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		System.out.println(T.solution(str));

	}
}
