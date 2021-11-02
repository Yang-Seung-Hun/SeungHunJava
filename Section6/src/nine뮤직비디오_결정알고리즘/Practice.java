package nine뮤직비디오_결정알고리즘;
//출제의도 : 이분검색 활용한 결정알고리즘 연습 + Arrays.stream()사용법 
import java.util.Arrays;
import java.util.Scanner;

public class Practice {
	
	public int filter(int mid, int n, int[] arr) {
		int cnt = 1;
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum = sum+arr[i];
			
			if(sum>mid) {
				cnt++;
				sum = arr[i];
			}
		}
		
		return cnt;
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0; 
		
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			
			if(filter(mid,n,arr) <= m) {
				answer = mid;
				rt = mid-1;
			}
			
			else {
				lt = mid+1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Practice T = new Practice();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n, m, arr));
	}

}
