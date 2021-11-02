package three매출액의종류;
//시간초과요 ㅜㅜ
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public int[] solution(int n, int m, int[] arr){
		int[] answer = new int[n-m+1];
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<n-m+1; i++) {
			map.clear();
			for(int j=0+i; j<i+m; j++) {
				map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
			}
			answer[i] = map.size();
		}	
		return answer;
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x:T.solution(n, m, arr)) {
			System.out.print(x+ " ");
		}

	}
}
