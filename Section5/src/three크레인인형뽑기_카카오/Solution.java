package three크레인인형뽑기_카카오;

import java.util.Scanner;
import java.util.Stack;

//내풀이랑 비슷한데 조건문 부분을 좀더 단순하게 함 
//그리고 나는 너무 오래 걸렸음 
//한번 비교하면서 보기
public class Solution {
	
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(int pos: moves) {
			for(int i=0; i<board.length; i++) {
				if(board[i][pos-1] != 0) {
					int tmp = board[i][pos-1];
					board[i][pos-1] = 0;
					if(!stack.isEmpty() && tmp ==stack.peek()) {//stack.peek()는 가장 나중에 들어간 놈
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
