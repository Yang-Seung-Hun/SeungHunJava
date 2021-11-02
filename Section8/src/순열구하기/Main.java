package �������ϱ�;
//�𸣰ڳ� ... �̤�
import java.util.Arrays;
import java.util.Scanner;

//10������ N���� �ڿ����� �־����� �� �� M���� �̾� �Ϸķ� �����ϴ� ����� ��� ����մϴ�.
//�Է¼��� : ù ��° �ٿ� �ڿ��� N(3<=N<=10)�� M(2<=M<=N)�� �־����ϴ�.
//        �� ��° �ٿ� N���� �ڿ����� ������������ �־����ϴ�.
//��¼��� : ù��° �ٿ� ����� ����մϴ�. ��¼����� ���������Դϴ�.
//�Է¿���: 3 2
//       3 6 9
//��¿���: 
//3 6
//3 9
//6 3
//6 9
//9 3
//9 6

public class Main {
	static int n,m;
	static int[] pm ;
	static int[] arr;
	static int[] ch;
	
	public void DFS(int L) {
		
		if(L == m) {
			for(int x:pm) System.out.print(x+" ");
			System.out.println();
		}
		
		else {
			for(int i=0; i<n; i++) {
				if(ch[i] == 0) {//�ߺ� ���ܺκ�
					ch[i] = 1;
					pm[L] = arr[i];
					DFS(L+1);
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		pm = new int[m];
		ch = new int[n];
		
		T.DFS(0);
	}

}
