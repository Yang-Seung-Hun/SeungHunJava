package nine��������_�����˰���;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	public int count(int[] arr, int capacity) {//dvd �������� ��������
		int cnt=1;
		int sum=0;
		
		for(int x:arr) {
			if(sum+x > capacity) {
				cnt++;
				sum = x;
			}
			else sum+=x;
		}
		
		return cnt;
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer =0;
		int lt = Arrays.stream(arr).max().getAsInt();//stream�� �ݺ��ڶ�� �������� => max�� ���鼭 �ִ� ã���� stream���� ���� int�� �ƴ϶� optionalint�� �� => getAsInt�Ἥ int�� �ٲ�
		int rt = Arrays.stream(arr).sum();//sum()�� �⺻�� int�� ��ȯ�� =>getAsInt()�ʿ� ���� (stream�� �ѹ� ã�ƺ��� �������� ����� ����!!!!)
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(arr,mid)<=m) {//m�� ���Ϸ� �ʿ��ϸ� �翬�� m�����ε� ���� �� ����
				answer = mid;
				rt = mid-1;
			}
			else lt = mid+1;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
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
