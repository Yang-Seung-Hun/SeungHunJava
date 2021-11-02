package nine뮤직비디오_결정알고리즘;
//모르겠어  ㅜㅜ
//강의 보고 결정알고리즘 설명 듣고 풀었음
//오답뜸 => 시발 
//*결정알고리즘은 어떤 정렬된 범위에서 답이 확실이 있을 때 사용 가능 이분 검색 활용함!!!

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public boolean isOkay(int mid, int m, int[] arr) {//중간값이 적절한건지 판단해주는 함수
		int sum = 0;
		int cnt = 1;
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
			if(sum>mid) {//앞에서부터 합이 mid 넘으면 카운트 업
				cnt++;
				sum = arr[i];//카운트하고 합 초기화
			}
		}
		
		if(cnt<=m) return true;//카운트가 m보다 작아야함
		
		return false;
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = arr[n-1];//외쪽값은 배열의 최대값 => 적어도 DVD길이는 이만큼은 되야함
		
		int rt = 0;
		for(int x: arr)rt = rt+x;//오른쪾값은 배열의 합 => DVD길이가 이거보다 클 이유가 없음
		
		while(lt<=rt) {
			int mid = (rt+lt)/2;
			if (isOkay(mid, m, arr)){
				rt = mid-1;
				answer = mid;
				System.out.println(answer);
			}
			else lt = mid+1;
		}
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
		
		System.out.println(T.solution(n, m, arr));
	}
}
