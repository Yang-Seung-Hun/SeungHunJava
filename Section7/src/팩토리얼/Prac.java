package ���丮��;
//�ڿ��� N�� ���丮�� 
public class Prac {
	
	public int DFS(int val) {
		if(val == 1) return 1;
		
		else {
			return val*DFS(val-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prac T = new Prac();
		System.out.println(T.DFS(6));
	}

}
