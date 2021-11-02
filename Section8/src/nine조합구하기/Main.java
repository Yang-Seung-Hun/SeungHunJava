package nine���ձ��ϱ�;
//1���� N���� ��ȣ�� ���� ������ �ֽ��ϴ�. ���� M���� �̴� ����� ���� ����ϴ� ���α׷��� �ۼ�
//�Է¼��� : ù��° �ٿ� �ڿ��� N(3<=N<=10)�� M(2<=M<=N)�� �־�����.
//��¼��� : ù��° �ٿ� ����� ����Ѵ�. ��¼����� ���������� ������������ ���.
//�Է¿��� : 4 2
//��¿��� : 
//1 2 
//1 3 
//1 4 
//2 3 
//2 4 
//3 4 

//��Ǯ���� �̤�
import java.util.Scanner;

public class Main {
	static int n,m;
	static int[] b,ch;
	
	public void DFS(int L) {
		if(L == m) {
			for(int x:b) System.out.print(x+" ");
			System.out.println();
		}
		
		else {
			
			for(int i=1; i<=n; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					b[L] = i;
					DFS(L + 1);
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
		
		b = new int[m];
		ch = new int[n+1];
		
		T.DFS(0);

	}

}
