package problem10;

import java.util.Scanner;

public class Solution {
	
	public int[] solution(String str, char t) {
		int[] answer = new int[str.length()];
		
		//���������� �̵��ϸ鼭 Ÿ�� ���� ������ p�� 0���� �ϰ�, �ȸ����� 1������ => ���ʿ��ִ� Ÿ�ٰ��� �Ÿ� ������
		int p = 1000;//���� ���� ���ʿ� Ÿ�ٹ��� �Ÿ����ϱ�
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == t) {
				p=0;
				answer[i] = p;
			}
			
			else {
				p++;
				answer[i] = p;
			}
		}
		
		//����� �ݺ��� �Ųٷ��ؼ� ���� �ݴ��� Ÿ�ٰ��� �Ÿ� ���ϴ� ��
		p = 1000;//���� ���� �����ʿ� Ÿ�ٹ��� �Ÿ����ϱ�
		for(int i=str.length()-1; i>=0; i--)
		{
			if(str.charAt(i) == t) {
				p=0;
			}
			
			else {
				p++;
				answer[i] = Math.min(answer[i], p);//���ʿ� �ִ� Ÿ�� ���ڿ��� �Ÿ����� ��������	
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);//�����ϰ� �б�
		
		for(int x : T.solution(str,c)) {
			System.out.print(x+" ");
		}
	}

}
