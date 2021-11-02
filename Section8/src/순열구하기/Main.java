package 순열구하기;
//모르겠네 ... ㅜㅜ
import java.util.Arrays;
import java.util.Scanner;

//10이하의 N개의 자연수가 주어지면 이 중 M개를 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
//입력설명 : 첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N)이 주어집니다.
//        두 번째 줄에 N개의 자연수가 오름차순으로 주어집니다.
//출력설명 : 첫번째 줄에 결과를 출력합니다. 출력순서는 오름차순입니다.
//입력예제: 3 2
//       3 6 9
//출력예제: 
//3 6
//3 9
//6 3
//6 9
//9 3
//9 6

public class Main {
	static int n,m;
	static int[] pm ;
	static int[] arr;
	static int[] ch;
	
	public void DFS(int L) {
		
		if(L == m) {
			for(int x:pm) System.out.print(x+" ");
			System.out.println();
		}
		
		else {
			for(int i=0; i<n; i++) {
				if(ch[i] == 0) {//중복 제외부분
					ch[i] = 1;
					pm[L] = arr[i];
					DFS(L+1);
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		pm = new int[m];
		ch = new int[n];
		
		T.DFS(0);
	}

}
