package five�����佺�׳׽�ü;
//�����佺�׳׽��� => ó�� üũ ������ ��� 0��. 2���� ī��Ʈ �� �� 2�� ����� �ε��� ���� ����, �� üũ �迭1�� �����.������Ű�鼭 üũ�迭 0�̸� ī��Ʈ �� �� ��� �ش�Ǵ°� 1�� �ٲٱ�.��� �ݺ�
import java.util.Scanner;

public class Solution {
	
public int solution(int n) {
		int answer=0;
		int[] ch = new int[n+1];
		for(int i=2; i<=n; i++) {
			if(ch[i]==0) {
				answer++;
				for(int j=i; j<=n; j=j+i) {
					ch[j] = 1;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		System.out.println(T.solution(n));

	}

}
