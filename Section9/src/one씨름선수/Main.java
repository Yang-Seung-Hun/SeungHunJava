package one¾¾¸§¼±¼ö;
//¸Â±äÇß´Â µ¥ ¹º°¡ ÂòÂòÇÑ ´À³¦...

import java.util.ArrayList;
import java.util.Scanner;

class P{
	int h;
	int w;
	public P(int h, int w) {
		this.h = h;
		this.w = w;
	}
}

public class Main {
	static ArrayList<P> Plist = new ArrayList<>();
	static int n;
	static int eliminated = 0;
	
	public void solution() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(Plist.get(i).h < Plist.get(j).h && Plist.get(i).w < Plist.get(j).w) {
					eliminated++;
					//System.out.println(Plist.get(i).h+" "+Plist.get(i).w);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		for(int i=0; i<n; i++) {
			int h = kb.nextInt();
			int w = kb.nextInt();
			P p = new P(h,w);
			Plist.add(p);
		}
		T.solution();
		System.out.println(n-eliminated);
	}
}
