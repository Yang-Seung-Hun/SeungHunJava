package 재귀함수_자연수출력;

//자연수 N이 입력되면 1부터 N까지 출력 하는 프로그래밍 => 재귀로

import java.util.Scanner;

public class Main {
	
	public void DFS(int n) {
		//재귀 함수는 주로 if/else 로 하기!!
		if(n==0) return;
		else {
			DFS(n-1);//stack 프레임!! => 매개 변수, 지역 변수, 복귀 주소를 stack에 담아둠
			System.out.print(n+ " ");
		}

		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		T.DFS(3);
	}

}
