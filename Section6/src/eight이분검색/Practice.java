package eight이분검색;
//출제 의도 이분 검색 활용하기
import java.util.Arrays;
import java.util.Scanner;

public class Practice {
	
	public int solution(int n, int m, int[] arr) {
		int lt = 0;
		int rt = n-1;
		Arrays.sort(arr);
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			
			if(arr[mid] == m)
				return mid+1;
			
			else if(arr[mid] > m) {
				rt = mid-1;
			}
			
			else if(arr[mid] <m) {
				lt = mid+1;
			}
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Practice T = new Practice();
		Scanner kb = new Scanner(System.in);
		int n =kb.nextInt();
		int[] arr = new int[n];
		int m =kb.nextInt();
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n, m, arr));
	}
}
