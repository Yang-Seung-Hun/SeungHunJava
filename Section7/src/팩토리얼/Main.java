package ���丮��;
// �ڿ��� N�� ���丮�� 
public class Main {
	
	public int DFS(int n) {
		if(n == 1) return 1 ;
		
		else return n*DFS(n-1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		System.out.println(T.DFS(5));
	}

}
