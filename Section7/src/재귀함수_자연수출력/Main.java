package ����Լ�_�ڿ������;

//�ڿ��� N�� �ԷµǸ� 1���� N���� ��� �ϴ� ���α׷��� => ��ͷ�

import java.util.Scanner;

public class Main {
	
	public void DFS(int n) {
		//��� �Լ��� �ַ� if/else �� �ϱ�!!
		if(n==0) return;
		else {
			DFS(n-1);//stack ������!! => �Ű� ����, ���� ����, ���� �ּҸ� stack�� ��Ƶ�
			System.out.print(n+ " ");
		}

		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		T.DFS(3);
	}

}
