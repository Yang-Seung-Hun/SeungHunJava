package 큰수출력;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public String solution(int[] nums) {
		String answer ="";		
		answer = answer+nums[0];
		for(int i=1; i<nums.length; i++) {
			if(nums[i]>nums[i-1]) {
				answer = answer+" "+nums[i];
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		kb.nextLine();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = Integer.parseInt(kb.next());
		}
		
		System.out.println(T.solution(nums));

	}
}
