package problem10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		String answer = "";
		
		String[] s = str.split(" ");
		String word = s[0];
		char T = s[1].charAt(0);
		
		for(int i=0; i<word.length(); i++)
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j=0; j<word.length(); j++)
			{
				if(word.charAt(j) == T)
				{
					list.add(Math.abs(i-j));
				}
			}
			answer = answer+Collections.min(list)+" ";//listÃÖ¼Ú°ª
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
