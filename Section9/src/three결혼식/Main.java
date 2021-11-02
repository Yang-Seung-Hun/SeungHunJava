package three결혼식;
//강의 설명 듣고 풀었음

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
	int start;
	char c;
	public Time(int start, char c){
		this.start = start;
		this.c = c;
	}
	@Override
	public int compareTo(Time o) {
		// TODO Auto-generated method stub
		if(this.start == o.start){
			return this.c-o.c;
		}
		
		else {
			return this.start - o.start;
		}
	}
}

public class Main {
	
	public int solution(ArrayList<Time> list, int n) {
		
		int answer = 0;
		int cnt = 0;
		
		Collections.sort(list);
		
		for(Time t : list) {
			if(t.c == 's') {
				cnt++;
			}
			else {
				cnt--;
			}
			answer = Math.max(cnt, answer);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		ArrayList<Time> list = new ArrayList<>();
		int n =kb.nextInt();
		for(int i=0; i<n; i++) {
			int s = kb.nextInt();
			int e = kb.nextInt();
			Time t1 = new Time(s,'s');
			Time t2 = new Time(e,'e');
			list.add(t1);
			list.add(t2);
		}
		System.out.println(T.solution(list, n));
	}
}
