package two공통원소구하기;
import java.util.ArrayList;
import java.util.Scanner;
//이중포문으로 하면 타임아웃이라 indexOf사용해서 풀었는데 두자리 정수 생기면 charAt사용 할수가 없어짐 예를들면 1 10 12 이런 정수들은 11012이 되버림 
public class Main {
	
	public ArrayList<Integer> solution(int n, int[] arr, int m, int[] arr2){
		ArrayList<Integer> answer = new ArrayList<>();
		
		return answer;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		int m = kb.nextInt();
		int[] arr2 = new int[m];
		for(int i=0; i<m; i++) {
			arr2[i] = kb.nextInt();
		}
		
		for(int x: T.solution(n, arr, m, arr2)) {
			System.out.print(x+" ");
		}

	}

}
