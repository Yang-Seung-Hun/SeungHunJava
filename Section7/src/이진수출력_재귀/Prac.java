package 이진수출력_재귀;
//10진수 N을 2진수로 변환 => 재귀사용
public class Prac {
	
	public void DFS(int val) {
		if(val == 0) return;
		
		else {
			int a = val/2;//몫
			int b = val%2;//나머지
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
