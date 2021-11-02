package five중복확인;
//Arrays.sort() 이거땜에 낸 문제
import java.util.Arrays;
import java.util.Scanner;

public class Practice {
	
	public String solution(int n, int[] arr) {
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++) {
			if(arr[i]==arr[i+1]) {
				return "D";
			}
		}
		return "U";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Practice T = new Practice();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n, arr));

	}

}
