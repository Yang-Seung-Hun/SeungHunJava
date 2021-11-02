package eight이분검색;
//시간 초과 뜸 => 여기 조심 부분에서 처음에 +start 없었음
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public int solution(int n, int m, int[] arr) {
		
		Arrays.sort(arr);
		int start = 0;
		int last = n-1;
		
		while(true) {
			int middle = (last-start)/2 + start;//여기조심
			
			if(arr[middle]>m) {
				last = middle-1;
			}
			
			else if(arr[middle]<m) {
				start = middle+1;
			}
			
			else {
				return middle+1;
			}
		}
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
		System.out.println(T.solution(n, m, arr));
	}
}
