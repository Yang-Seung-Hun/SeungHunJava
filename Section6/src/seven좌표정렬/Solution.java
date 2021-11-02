package seven좌표정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//좌표 정렬하는 방법임 외우세요
//compareable인터페이스 안에 객체 정렬 메소드(compareTo())가 정의되있음

class Point implements Comparable<Point>{
	public int x,y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point o) {
		if(this.x == o.x) return this.y-o.y;//this에서 o를빼면 오름차순 이반대는 내림차순
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
		Collections.sort(arr);//정렬 기준은 위에서 만든 compareTo가 됨
		for(Point o: arr) System.out.println(o.x+" "+o.y);
	}

}
