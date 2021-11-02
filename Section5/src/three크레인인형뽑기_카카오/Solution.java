package threeũ���������̱�_īī��;

import java.util.Scanner;
import java.util.Stack;

//��Ǯ�̶� ����ѵ� ���ǹ� �κ��� ���� �ܼ��ϰ� �� 
//�׸��� ���� �ʹ� ���� �ɷ��� 
//�ѹ� ���ϸ鼭 ����
public class Solution {
	
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(int pos: moves) {
			for(int i=0; i<board.length; i++) {
				if(board[i][pos-1] != 0) {
					int tmp = board[i][pos-1];
					board[i][pos-1] = 0;
					if(!stack.isEmpty() && tmp ==stack.peek()) {//stack.peek()�� ���� ���߿� �� ��
						answer += 2;
						stack.pop();
					}
					else stack.push(tmp);
					break;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();
		int[][] board = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		int M = kb.nextInt();
		int[] moves = new int[M];
		for(int i=0; i<M; i++) {
			moves[i] = kb.nextInt();
		}
		System.out.println(T.solution(board, moves));
	}

}
