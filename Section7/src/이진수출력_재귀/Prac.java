package ���������_���;
//10���� N�� 2������ ��ȯ => ��ͻ��
public class Prac {
	
	public void DFS(int val) {
		if(val == 0) return;
		
		else {
			int a = val/2;//��
			int b = val%2;//������
			DFS(a);
			System.out.print(b+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prac T = new Prac();
		
		T.DFS(56);

	}

}
