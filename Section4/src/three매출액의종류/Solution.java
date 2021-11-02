package three매출액의종류;
import java.util.ArrayList;
import java.util.HashMap;
//two pointer알고리즘,슬라이딩 window 사용함!!!!!!!!
import java.util.Scanner;

public class Solution {
	
	public ArrayList<Integer> solution(int n, int m, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		int lt = 0;
		
		for(int i=0; i<m-1; i++) {//해쉬에다 일단 앞에 m-1까지 넣은상태로 세팅해줌
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		for(int rt=m-1; rt<n; rt++) {//여기서 부터 투포인트 알고리즘사용
			map.put(arr[rt],map.getOrDefault(arr[rt], 0)+1);
			answer.add(map.size());
			map.put(arr[lt],map.get(arr[lt])-1);
			if(map.get(arr[lt])== 0) map.remove(arr[lt]);
			lt++;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
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
