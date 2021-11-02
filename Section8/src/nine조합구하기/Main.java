package nine조합구하기;
//1부터 N까지 번호가 적힌 구슬이 있습니다. 이중 M개를 뽑는 방법의 수를 출력하는 프로그램을 작성
//입력설명 : 첫번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N)이 주어진다.
//출력설명 : 첫번째 줄에 결과를 출력한다. 출력순서는 사전순으로 오름차순으로 출력.
//입력예제 : 4 2
//출력예제 : 
//1 2 
//1 3 
//1 4 
//2 3 
//2 4 
//3 4 

//못풀었음 ㅜㅜ
import java.util.Scanner;

public class Main {
	static int n,m;
	static int[] b,ch;
	
	public void DFS(int L) {
		if(L == m) {
			for(int x:b) System.out.print(x+" ");
			System.out.println();
		}
		
		else {
			
			for(int i=1; i<=n; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					b[L] = i;
					DFS(L + 1);
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
		
		b = new int[m];
		ch = new int[n+1];
		
		T.DFS(0);

	}

}
