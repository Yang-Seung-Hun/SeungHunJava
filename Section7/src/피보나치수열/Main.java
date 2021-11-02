package 피보나치수열;

import java.util.Scanner;

//피보나치 수열 출력하기
//배열말고 재귀로 풀기
//포문이 더 성능이 좋긴 함 =>재귀는 stack frame 생기니까 
//메모리제이션(기록)을 통해 재귀 성능을 향상히킴!!!!!

public class Main {
	static int[] fibo;//조금 성능 향상 시키기 위한 배열임
	public int DFS(int n) {
		
		//요기 없음면 성능 조금만 향상됨
		//이미 구한 것을 활용 한다는 개념
		//D(5)=>D(4)+D(3)=>D(3)+D(2)+D(2)+D(1) 이런식으로 되는데 D(3)을 예로 들자면 앞에서 이미 구했으니 뒤에서는 구할 필요가 없어짐
		if(fibo[n] > 0) return fibo[n];//****성능 완전 증가 시키는 포인트****
		
		
		if(n==1) return fibo[n] = 1;
		else if(n==2) return fibo[n] = 1;
		else return fibo[n] = DFS(n-2) + DFS(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		int n =45;
		
		//성능 향상
		fibo = new int[n+1];
		T.DFS(n);
		for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
		
		//이거는 너무
		//for(int i=1; i<=n; i++)System.out.print(T.DFS(i)+" ");
		
	}
}
