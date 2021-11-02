package 부분집합구하기_DFS;
//몰랑 ㅜㅜ
//트리 그리고, 스택도 그리면서 복습하자!! 
public class Main {
	
	static int n;
	static int[] ch;//1부터 n까지 중에서 부분집합에 있는지 없는지 표시용 만약 배열이 110이라고 하면  부분집합 1,2에 해당
	public void DFS(int L) {
		if(L==n+1) {
			String tmp = "";
			for(int i=1; i<=n; i++) {
				if(ch[i] == 1) tmp+=(i+" ");
			}
			if(tmp.length()>0)System.out.println(tmp);//공지합은 출력 안하니까
		}
		else {
			ch[L] = 1;//포함
			DFS(L+1);//왼쪽으로 뻗음
			ch[L] = 0;//안포함
			DFS(L+1);//오른쪽으로 뻗음
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main T = new Main();
		n=3;
		ch = new int[n+1];
		T.DFS(1);
	}

}
