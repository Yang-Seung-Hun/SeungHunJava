package 재귀함수_자연수출력;
//자연수 N이 입력되면 1부터 N까지 출력 하는 프로그래밍 => 재귀로
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
