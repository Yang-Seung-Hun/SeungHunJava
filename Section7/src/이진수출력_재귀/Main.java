package ���������_���;

//10���� N�� 2������ ��ȯ => ��ͻ��

public class Main {
	
	public void DFS(int n) {
		if(n == 0) return;
		
		else {
			DFS(n/2);
			System.out.print(n%2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		T.DFS(56);
	}

}
