package six���ֱ��ϱ�;
//queue.contains(*) ��  ť�� *���ִ��� ������
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();//ť ����ҷ��� ��ũ�帮��Ʈ
		int cnt = 1;
		
		for(int i=1; i<=n; i++) {
			queue.offer(i);//ť�� �ֱ�
		}
		
		while(queue.size()>1) {
			int tmp = queue.poll();//ť���� ������
			if(cnt == k) {
				cnt = 1;
			}
			
			else {
				cnt++;
				queue.offer(tmp);
			}
		}
		
		answer = queue.peek();//�� �տ��ִ� �� Ȯ���ϱ�
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int k = kb.nextInt();
		
		System.out.println(T.solution(n, k));
	}
}
