package four���ӵ��ڿ�������;

import java.util.Scanner;

//ù��° Ǯ�̴� �� Ǯ�̶� ����
//�ι�° Ǯ�̴� ����������
public class Solution {
	
	public int solution(int n) {
		int answer = 0;
		int cnt = 1;
		n--;
		while(n>0) {//���ӵ� ���� 2���� �� ���� ������� �������� ����
			cnt++;//���ӵ� �ڿ��� ����
			n=n-cnt;//�տ��� ������ ��ŭ�̶�� �����ϸ� ��
			if(n%cnt==0) {//���ӵ� ����1 2 3.... ������ �迭�� ������ �ո�ŭ ���� �����ָ� �Ǵ±� ���� ���� ���ӵ� ������ ������ �������� ����
				answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n= kb.nextInt();
		
		System.out.println(T.solution(n));

	}

}
