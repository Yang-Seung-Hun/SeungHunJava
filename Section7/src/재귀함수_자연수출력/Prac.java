package ����Լ�_�ڿ������;
//�ڿ��� N�� �ԷµǸ� 1���� N���� ��� �ϴ� ���α׷��� => ��ͷ�
public class Prac {
	
	public void DFS(int val) {
		if(val == 1) {
			System.out.print(val+" ");
			return;
		}
		else DFS(val-1);
		System.out.print(val+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prac T = new Prac();
		T.DFS(30);
	}

}
