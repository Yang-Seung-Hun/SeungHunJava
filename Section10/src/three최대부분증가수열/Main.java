package three�ִ�κ���������;
//���ǵ�� Ǯ����
//point!! : d[i] �� arr[i]�� ���������� �Ҷ� �ִ� ���̶�� �����ϱ�

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static int n;
	static int[] arr;
	static int[] dy;
	
	public int solution() {
		ArrayList<Integer> list = new ArrayList<>();
		dy[0] = 1;
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j]) {
					list.add(dy[j]+1);
				}
			}
			if(list.size() == 0) list.add(1);
			dy[i] = Collections.max(list);
			list.clear();
		}
		return Arrays.stream(dy).max().getAsInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		arr = new int[n];
		dy = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution());
	}
}
