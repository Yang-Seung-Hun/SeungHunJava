package two���̴��л�;
//���� �ݺ����� �ð� �ʹ� ���� ��!!! �� ��� �˾Ƶα�
import java.util.Scanner;

public class Solution {
	
public int solution(int[] arr, int n) {
		int answer = 1;//�Ǿջ���� �⺻���� ���̴ϱ�
		int max = arr[0];//���� �ε��������� �ִ� �̰ź��� Ŀ�߸� ����!!
		
		for(int i=1; i<n; i++) {
			if(arr[i]>max) {
				answer++;
				max = arr[i];
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

		System.out.println(T.solution(arr, n));
	}
}
