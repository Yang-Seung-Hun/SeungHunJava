package six장난꾸러기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		int[] tmp = arr.clone();//깊은 복사!!!
		Arrays.sort(tmp);
		for(int i=0; i<n; i++) {
			if(arr[i]!=tmp[i]) answer.add(i+1);
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
		
		for(int x:T.solution(n, arr)) {
			System.out.print(x+" ");
		}

	}

}
