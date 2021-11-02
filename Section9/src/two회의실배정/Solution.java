package twoȸ�ǽǹ���;
//ȸ�� ������ �ð��� �������� ���������ϰ� (���࿡ ������ �ð� ������ ���۽ð�����)
//���۽ð����� ������

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
	int s,e;
	public Time(int s, int e) {
		this.s = s;
		this.e = e;
	}
	@Override
	public int compareTo(Time o) {
		// TODO Auto-generated method stub
		if(this.e == o.e) return this.s-o.s;
		else return this.e-o.e;
	}
}

public class Solution {
	
	public int solution(ArrayList<Time> arr, int n) {
		int cnt=0;
		Collections.sort(arr);
		int et = 0;
		for(Time ob : arr) {
			if(ob.s>=et) {
				cnt++;
				et = ob.e;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for(int i=0; i<n;i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Time(x,y));
		}
		System.out.println(T.solution(arr, n));
	}

}
