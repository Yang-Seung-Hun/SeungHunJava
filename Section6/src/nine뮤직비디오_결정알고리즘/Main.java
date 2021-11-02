package nine��������_�����˰���;
//�𸣰ھ�  �̤�
//���� ���� �����˰��� ���� ��� Ǯ����
//����� => �ù� 
//*�����˰����� � ���ĵ� �������� ���� Ȯ���� ���� �� ��� ���� �̺� �˻� Ȱ����!!!

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public boolean isOkay(int mid, int m, int[] arr) {//�߰����� �����Ѱ��� �Ǵ����ִ� �Լ�
		int sum = 0;
		int cnt = 1;
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
			if(sum>mid) {//�տ������� ���� mid ������ ī��Ʈ ��
				cnt++;
				sum = arr[i];//ī��Ʈ�ϰ� �� �ʱ�ȭ
			}
		}
		
		if(cnt<=m) return true;//ī��Ʈ�� m���� �۾ƾ���
		
		return false;
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = arr[n-1];//���ʰ��� �迭�� �ִ밪 => ��� DVD���̴� �̸�ŭ�� �Ǿ���
		
		int rt = 0;
		for(int x: arr)rt = rt+x;//�����U���� �迭�� �� => DVD���̰� �̰ź��� Ŭ ������ ����
		
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
