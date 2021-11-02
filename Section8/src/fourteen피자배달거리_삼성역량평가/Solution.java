package fourteen���ڹ�ްŸ�_�Ｚ������;
//�����ǵ� : DFSȰ�� ������ �̿��ؼ� ���� Ǯ��
//������ �ٽ� Ǯ�� ����
import java.util.ArrayList;
import java.util.Scanner;

class Point{
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Solution {
	static int n,m,len;
	static int answer = Integer.MAX_VALUE;
	static int[] combi;
	static ArrayList<Point> pz, hs;
	
	public void DFS(int L, int s) {//6�� ���� �߿� 4�� ���� ����!!!! => ������ �� �ܿ���
		if(L==m) {//���⼭ combi�� ����� ���õ� 4���� �ε��� ��� 
			int sum = 0;
			for(int i=0; i<m; i++) System.out.print(combi[i]+" ");
			System.out.println();
			for(Point h : hs) {
				int dis = Integer.MAX_VALUE;
				for(int i:combi) {
					dis = Math.min(dis,Math.abs(h.x-pz.get(i).x)+Math.abs(h.y-pz.get(i).y));
				}
				sum+=dis;
			}
			answer = Math.min(answer, sum);
		}
		
		else {
			for(int i=s; i<len; i++) {
				combi[L] = i;
				DFS(L+1,i+1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pz = new ArrayList<>();
		hs = new ArrayList<>();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int tmp = kb.nextInt();
				if(tmp == 1) hs.add(new Point(i,j));
				else if(tmp == 2) pz.add(new Point(i,j));
			}
		}
		
		len = pz.size();
		combi = new int[m];
		T.DFS(0,0);
		System.out.println(answer);
		

	}

}
