package two������ұ��ϱ�;
import java.util.ArrayList;
import java.util.Scanner;
//������������ �ϸ� Ÿ�Ӿƿ��̶� indexOf����ؼ� Ǯ���µ� ���ڸ� ���� ����� charAt��� �Ҽ��� ������ ������� 1 10 12 �̷� �������� 11012�� �ǹ��� 
public class Main {
	
	public ArrayList<Integer> solution(int n, int[] arr, int m, int[] arr2){
		ArrayList<Integer> answer = new ArrayList<>();
		
		return answer;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
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
