package seven��ǥ����;
//���� �ǵ�: compareable�������̽� ����ؼ� ��ü �迭 �ϴ� �� ������
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point2 implements Comparable<Point2>{
	
	int x = 0;
	int y = 0;
	
	public Point2(int x, int y) {
		this.x =x;
		this.y =y;
	}

	@Override
	public int compareTo(Point2 o) {
		// TODO Auto-generated method stub
		if(this.x == o.x) return this.y-o.y;
		else return this.x-o.x;
	}
}

public class Practice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice p = new Practice();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Point2> list = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			list.add(new Point2(x,y));
		}
		
		Collections.sort(list);
		for(Point2 o:list) System.out.println(o.x+" "+o.y);
		
	}

}
