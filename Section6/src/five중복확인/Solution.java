package five중복확인;
import java.util.Arrays;
//그냥 정렬로도 풀수 있구나 보여주고 싶으셨단다.
//헤쉬맵으로 푸는게 가장 효율이 좋다고 하신다.
import java.util.Scanner;

public class Solution {
	
	public String solution(int n, int[] arr) {
		String answer = "U";
		Arrays.sort(arr);//오름차순
		for(int i=0; i<n-1; i++) {
			if(arr[i] == arr[i+1]) return "D";
		}
		return answer;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n, arr));

	}

}
