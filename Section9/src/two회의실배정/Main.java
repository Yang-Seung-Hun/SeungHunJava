package twoÈ¸ÀÇ½Ç¹èÁ¤;
//¸ô¶û

import java.util.ArrayList;
import java.util.Scanner;

class Meeting{
	int s;
	int e;
	public Meeting(int s, int e) {
		this.s = s;
		this.e = e;
	}
}

public class Main {
	static int n;
	static ArrayList<Meeting> list = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		for(int i=0; i<n; i++) {
			int s = kb.nextInt();
			int e = kb.nextInt();
			Meeting m = new Meeting(s,e);
			list.add(m);
		}
	}

}
