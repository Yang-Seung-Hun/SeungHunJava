package �Ǻ���ġ����;

import java.util.Scanner;

//�Ǻ���ġ ���� ����ϱ�
//�迭���� ��ͷ� Ǯ��
//������ �� ������ ���� �� =>��ʹ� stack frame ����ϱ� 
//�޸����̼�(���)�� ���� ��� ������ �����Ŵ!!!!!

public class Main {
	static int[] fibo;//���� ���� ��� ��Ű�� ���� �迭��
	public int DFS(int n) {
		
		//��� ������ ���� ���ݸ� ����
		//�̹� ���� ���� Ȱ�� �Ѵٴ� ����
		//D(5)=>D(4)+D(3)=>D(3)+D(2)+D(2)+D(1) �̷������� �Ǵµ� D(3)�� ���� ���ڸ� �տ��� �̹� �������� �ڿ����� ���� �ʿ䰡 ������
		if(fibo[n] > 0) return fibo[n];//****���� ���� ���� ��Ű�� ����Ʈ****
		
		
		if(n==1) return fibo[n] = 1;
		else if(n==2) return fibo[n] = 1;
		else return fibo[n] = DFS(n-2) + DFS(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		int n =45;
		
		//���� ���
		fibo = new int[n+1];
		T.DFS(n);
		for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
		
		//�̰Ŵ� �ʹ�
		//for(int i=1; i<=n; i++)System.out.print(T.DFS(i)+" ");
		
	}
}
