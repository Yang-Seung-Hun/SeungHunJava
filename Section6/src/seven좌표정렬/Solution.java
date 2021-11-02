package seven��ǥ����;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//��ǥ �����ϴ� ����� �ܿ켼��
//compareable�������̽� �ȿ� ��ü ���� �޼ҵ�(compareTo())�� ���ǵ�����

class Point implements Comparable<Point>{
	public int x,y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point o) {
		if(this.x == o.x) return this.y-o.y;//this���� o������ �������� �̹ݴ�� ��������
		else return this.x-o.x;
	}
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n =kb.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Point(x,y));
		}
		Collections.sort(arr);//���� ������ ������ ���� compareTo�� ��
		for(Point o: arr) System.out.println(o.x+" "+o.y);
	}

}
