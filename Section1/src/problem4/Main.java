package problem4;

import java.util.Scanner;

public class Main {

	public String[] solution(String[] str,int num) {
		String answer[] = new String[num];
		int idx = 0;
		
		for(String x : str) {
			char[] y = x.toCharArray();
			answer[idx] = "";
			for(int i=y.length-1; i>=0; i--)
			{
				answer[idx] = answer[idx]+y[i];
			}
			idx++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		
		String[] str = new String[num];
		for(int i=0; i<num; i++)
		{
			str[i] = kb.next();
		}
		
		for(String x : T.solution(str,num))
		{
			System.out.println(x);
		}
		
	}
}
