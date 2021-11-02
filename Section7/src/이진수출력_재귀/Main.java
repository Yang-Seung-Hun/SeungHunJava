package 이진수출력_재귀;

//10진수 N을 2진수로 변환 => 재귀사용

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
