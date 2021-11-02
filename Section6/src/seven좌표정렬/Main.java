package sevenÁÂÇ¥Á¤·Ä;

import java.util.Scanner;

class XY{
	int x = 0;
	int y = 0;
	public XY(int x, int y) {
		this.x = x;
		this.y =y;
	}
}

public class Main {
	
	public XY[] solution(int n, XY[] xy) {
		
		for(int j=0; j<n-1; j++)
		{
			for (int i = j+1; i < n; i++) {
				if (xy[j].x > xy[i].x) {
					XY tmp = xy[j];
					xy[j] = xy[i];
					xy[i] = tmp;
				} else if ((xy[j].x == xy[i].x) && (xy[j].y > xy[i].y)) {
					XY tmp = xy[j];
					xy[j] = xy[i];
					xy[i] = tmp;
				}
			}
		}
		
		return xy;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		XY[] xy = new XY[n];
		for(int i=0; i<n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			xy[i] = new XY(x,y);
		}
		
		for(XY x: T.solution(n, xy)) {
			System.out.println(x.x+" "+x.y);
		}
	}
}
