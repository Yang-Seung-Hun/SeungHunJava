package two������ұ��ϱ�;
import java.util.*;

//two pointer �˰��� ���!!!
public class Solution {
	
	public ArrayList<Integer> solution(int n, int[] a, int m, int[] b){
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(a);//Arrys.sort�� �迭�� ������������ ��������
		Arrays.sort(b);//two pointer �˰��� ����ϱ� ���� ������������
		int p1=0;
		int p2=0;//������ �ΰ� ����
		
		while(p1<n && p2<m) {
			if(a[p1] == b[p2]) {//�ΰ��� ������ answer�� ��� ������ ���� ������Ŵ
				answer.add(a[p1++]);
				p2++;
			}
			
			else if(a[p1] < b[p2]) {//�������� pointer ������Ŵ
				p1++;
			}
			
			else {//������ pointer ������Ŵ
				p2++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		int m = kb.nextInt();
		int[] arr2 = new int[m];
		for(int i=0; i<m; i++) {
			arr2[i] = kb.nextInt();
		}
		
		for(int x: T.solution(n, arr, m, arr2)) {
			System.out.print(x+" ");
		}
		

	}

}
