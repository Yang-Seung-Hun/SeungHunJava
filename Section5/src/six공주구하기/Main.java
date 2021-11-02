package six공주구하기;
//queue.contains(*) 는  큐에 *가있는지 없는지
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();//큐 사용할려면 링크드리스트
		int cnt = 1;
		
		for(int i=1; i<=n; i++) {
			queue.offer(i);//큐에 넣기
		}
		
		while(queue.size()>1) {
			int tmp = queue.poll();//큐에서 꺼내기
			if(cnt == k) {
				cnt = 1;
			}
			
			else {
				cnt++;
				queue.offer(tmp);
			}
		}
		
		answer = queue.peek();//젤 앞에있는 값 확인하기
		
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
