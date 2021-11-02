package two공통원소구하기;
import java.util.*;

//two pointer 알고리즘 사용!!!
public class Solution {
	
	public ArrayList<Integer> solution(int n, int[] a, int m, int[] b){
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(a);//Arrys.sort는 배열을 오름차순으로 정리해줌
		Arrays.sort(b);//two pointer 알고리즘 사용하기 위해 오름차순으로
		int p1=0;
		int p2=0;//포인터 두개 설정
		
		while(p1<n && p2<m) {
			if(a[p1] == b[p2]) {//두값이 같을때 answer에 담고 포인터 각각 증가시킴
				answer.add(a[p1++]);
				p2++;
			}
			
			else if(a[p1] < b[p2]) {//작은쪽의 pointer 증가시킴
				p1++;
			}
			
			else {//작은쪽 pointer 증가시킴
				p2++;
			}
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
		int m = kb.nextInt();
		int[] arr2 = new int[m];
		for(int i=0; i<m; i++) {
			arr2[i] = kb.nextInt();
		}
		
		for(int x: T.solution(n, arr, m, arr2)) {
			System.out.print(x+" ");
		}
		

	}

}
