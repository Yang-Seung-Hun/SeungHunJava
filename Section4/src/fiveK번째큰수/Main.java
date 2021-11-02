package fiveK번째큰수;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public int solution(int n, int m, int[] arr) {
		int answer = -1;
		HashMap<Integer,Integer> map = new HashMap<>();
		
		int sum = 0;
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					sum = arr[i]+arr[j]+arr[k];
					map.put(sum, map.getOrDefault(sum, 0)+1);
				}
			}
		}
		
		if(map.size()<m) {
			return -1;
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int x: map.keySet())
		{
			list.add(x);
		}
		
		list.sort(null);
		answer = list.get(list.size()-m);
	
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n,m,arr));
	}
}
